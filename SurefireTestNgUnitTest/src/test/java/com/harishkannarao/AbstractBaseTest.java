package com.harishkannarao;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class AbstractBaseTest {

    protected String testName;
    protected String testClass;

    @BeforeMethod
    public void globalSetUp(Method method) throws Exception {
        testClass = method.getDeclaringClass().getCanonicalName();
        testName = method.getName();
    }
}
