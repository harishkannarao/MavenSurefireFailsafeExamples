package com.harishkannarao.spring.testng.test;

import com.harishkannarao.spring.testng.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class SampleSpringTest extends AbstractBaseTest{
    @Autowired
    @Qualifier("SomeTestService")
    SomeService myService;

    @Test
    public void test_service_always_return_true() {

        //assert true
        assertTrue(myService.isValid());

    }
}
