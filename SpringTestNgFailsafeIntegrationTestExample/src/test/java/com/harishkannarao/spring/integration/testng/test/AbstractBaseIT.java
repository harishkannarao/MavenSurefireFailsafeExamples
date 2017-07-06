package com.harishkannarao.spring.integration.testng.test;


import com.harishkannarao.spring.integration.testng.config.TestConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@ContextConfiguration(classes = {TestConfig.class})
public abstract class AbstractBaseIT extends AbstractTestNGSpringContextTests {
}
