package ru.ilya;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ilya.repos.TestObjectRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("TestService")
@Repository("TestService")
@Transactional
public class TestServiceImpl implements TestService {
    @PersistenceContext
    private EntityManager entityManager;

    public static final String SERVICE_NAME = "TestService";

    @Autowired
    private TestObjectRepository contactRepository;

    public List<TestObject> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    public TestObject save(TestObject testObject) {
        return contactRepository.save(testObject);
    }
}
