package com.xc.bootdemo.config;

import com.xc.bootdemo.interceptor.MyAuthInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    private MyAuthInterceptor myAuthInterceptor;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myAuthInterceptor).addPathPatterns("/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }

    @Bean
    public UserDetailsService userDetailsService(){
        DataSource ds = sqlSessionFactory.getConfiguration().getEnvironment().getDataSource();
        return new JdbcUserDetailsManager(ds);
    }

}
