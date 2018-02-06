package ru.ilya;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TestObject.class)
public abstract class TestObject_ {
    public static volatile SingularAttribute<TestObject, Long> id;
    public static volatile SingularAttribute<TestObject, String> myData;
}
