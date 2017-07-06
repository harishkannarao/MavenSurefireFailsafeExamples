package com.harishkannarao.spring.integration.testng.service;

import org.springframework.stereotype.Component;

@Component("SomeTestService")
public class SomeService {
    public boolean isValid() {
        return true;
    }
}
