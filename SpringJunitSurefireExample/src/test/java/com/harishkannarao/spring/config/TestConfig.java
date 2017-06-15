package com.harishkannarao.spring.config;

import com.harishkannarao.spring.ClassToPlacedInBasePackageToEnableAutoScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ClassToPlacedInBasePackageToEnableAutoScan.class})
public class TestConfig {
}
