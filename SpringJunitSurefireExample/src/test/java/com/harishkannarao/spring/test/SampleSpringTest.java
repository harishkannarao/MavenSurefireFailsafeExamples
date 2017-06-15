package com.harishkannarao.spring.test;

import com.harishkannarao.spring.config.TestConfig;
import com.harishkannarao.spring.service.SomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class SampleSpringTest {
    @Autowired
    @Qualifier("SomeTestService")
    SomeService myService;

    @Test
    public void test_service_always_return_true() {

        //assert true
        assertTrue(myService.isValid());

    }
}
