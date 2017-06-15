package com.harishkannarao.spring.test;

import com.harishkannarao.spring.service.SomeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.Assert.assertTrue;

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
