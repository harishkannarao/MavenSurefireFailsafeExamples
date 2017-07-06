package com.harishkannarao.spring.testng.config;

import com.harishkannarao.spring.testng.ClassToPlacedInBasePackageToEnableAutoScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackageClasses = {ClassToPlacedInBasePackageToEnableAutoScan.class})
@PropertySources({
        @PropertySource("classpath:properties/${test.env:local}-test-config.properties")
})
public class TestConfig {
}
