package com.harishkannarao.spring.integration.testng.test;

import org.springframework.beans.factory.annotation.Value;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class SamplePropertiesIT extends AbstractBaseIT {
    private static final Logger log = Logger.getLogger(SamplePropertiesIT.class.getName());

    @Value("${somePropertyValue}")
    private boolean somePropertyValue;

    @Test
    public void shouldReadPropertyFile() throws Exception {
        String testEnv = System.getProperty("test.env", "local");
        log.info("testEnv = " + testEnv);
        log.info("somePropertyValue = " + somePropertyValue);
        if("local".equals(testEnv)) {
            Assert.assertEquals(true, somePropertyValue);
        } else if ("dev".equals(testEnv)) {
            Assert.assertEquals(false, somePropertyValue);
        } else {
            Assert.fail("Unknown value: " + testEnv);
        }
    }
}
