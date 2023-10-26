package dream.js.hellospringnative.repository;

import dream.js.hellospringnative.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}