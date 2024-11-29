import http from "k6/http";
import { check } from "k6";

export const options = {
  vus: 200, // 虚拟用户数
  duration: "30s", // 测试持续时间
  thresholds: {
    http_req_failed: ["rate<0.01"], // 请求失败率应小于1%
    http_req_duration: ["p(95)<500"], // 95%的请求应在500ms内完成
  },
};

export default function () {
  const res = http.get("http://localhost:8081/persons");

  check(res, {
    "status is 200": (r) => r.status === 200,
    "response time < 200ms": (r) => r.timings.duration < 200,
  });
}
