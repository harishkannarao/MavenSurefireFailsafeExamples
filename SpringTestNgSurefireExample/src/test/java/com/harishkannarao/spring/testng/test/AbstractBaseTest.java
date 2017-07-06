package com.harishkannarao.spring.testng.test;


import com.harishkannarao.spring.testng.config.TestConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@ContextConfiguration(classes = {TestConfig.class})
public abstract class AbstractBaseTest extends AbstractTestNGSpringContextTests {
}
