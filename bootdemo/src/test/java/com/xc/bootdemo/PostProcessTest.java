package com.xc.bootdemo;

import com.xc.bootdemo.postProcessor.ExtConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostProcessTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);

        applicationContext.close();
    }

}
