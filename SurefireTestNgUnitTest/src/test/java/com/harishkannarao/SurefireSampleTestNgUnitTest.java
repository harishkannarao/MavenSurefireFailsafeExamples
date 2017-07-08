package com.harishkannarao;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SurefireSampleTestNgUnitTest extends AbstractBaseTest {

    private String additionalField;

    @BeforeMethod
    public void setUp() throws Exception {
        additionalField = "mytestvalue";
    }

    @Test
    public void surefireSampleUnitTest1() {
        assertEquals(additionalField, "mytestvalue");
        assertEquals(testName, "surefireSampleUnitTest1");
        assertEquals(testClass, "com.harishkannarao.SurefireSampleTestNgUnitTest");
    }

    @Test
    public void surefireSampleUnitTest2() {
        Assert.assertTrue(true);
    }
}
