package com.xc.bootdemo.postProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan()
@Configuration
public class ExtConfig {

    @Bean
    public Blue blue(){
        return new Blue();
    }

}