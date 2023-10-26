CREATE TABLE person (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT
);

INSERT INTO person (name, age) VALUES ('Hello', 1);
INSERT INTO person (name, age) VALUES ('Spring', 2);
INSERT INTO person (name, age) VALUES ('Native', 3);