package ru.ilya;

import java.util.List;

public interface TestService {
    List<TestObject> findAll();
    TestObject save(TestObject testObject);
}
