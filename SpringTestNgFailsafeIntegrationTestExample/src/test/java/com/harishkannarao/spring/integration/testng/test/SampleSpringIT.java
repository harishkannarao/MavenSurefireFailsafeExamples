package com.harishkannarao.spring.integration.testng.test;

import com.harishkannarao.spring.integration.testng.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class SampleSpringIT extends AbstractBaseIT {
    @Autowired
    @Qualifier("SomeTestService")
    SomeService myService;

    @Test
    public void test_service_always_return_true() {

        //assert true
        assertTrue(myService.isValid());

    }
}
