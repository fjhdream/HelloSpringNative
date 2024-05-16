package dream.js.hellospringnative;

import dream.js.hellospringnative.entity.Person;
import dream.js.hellospringnative.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    private final PersonRepository personRepository;

    public CommonController(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public Iterable<Person> persons() {
        return personRepository.findAll();
    }

    @GetMapping("/hello")
    public String hello() {
        return "world";
    }
}
