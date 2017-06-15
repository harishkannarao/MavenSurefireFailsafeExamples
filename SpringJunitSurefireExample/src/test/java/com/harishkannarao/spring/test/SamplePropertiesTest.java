package com.harishkannarao.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

public class SamplePropertiesTest extends AbstractBaseTest {
    @Value("${somePropertyValue}")
    private boolean somePropertyValue;

    @Test
    public void shouldReadPropertyFile() throws Exception {
        String testEnv = System.getProperty("test.env", "local");
        System.out.println("testEnv = " + testEnv);
        System.out.println("somePropertyValue = " + somePropertyValue);
        if("local".equals(testEnv)) {
            Assert.assertEquals(true, somePropertyValue);
        } else if ("dev".equals(testEnv)) {
            Assert.assertEquals(false, somePropertyValue);
        } else {
            Assert.fail("Unknown value: " + testEnv);
        }
    }
}
