package ru.ilya.repos;

import org.springframework.data.repository.CrudRepository;
import ru.ilya.TestObject;

public interface TestObjectRepository extends CrudRepository<TestObject, Long> {
}
