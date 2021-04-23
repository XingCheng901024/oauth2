package com.xc.oauth2example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {    //auth.inMemoryAuthentication()
        auth.inMemoryAuthentication().withUser("xc1").password("111").authorities("/");
        auth.inMemoryAuthentication().withUser("xc2").password("111").authorities("add", "edit");
        auth.inMemoryAuthentication().withUser("xc3").password("111").authorities("delete", "select");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/add").hasAnyAuthority("add")
                .antMatchers("/edit").hasAnyAuthority("edit")
                .antMatchers("/delete").hasAnyAuthority("delete")
                .antMatchers("/select").hasAnyAuthority("select")
                .antMatchers("/login").permitAll()
                .antMatchers("/**").fullyAuthenticated().and().formLogin().loginPage("/login").and().csrf().disable();
        /*http   // 配置登录页并允许访问
                .formLogin().permitAll()
                // 配置Basic登录
                //.and().httpBasic()
                // 配置登出页面
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/")
                .and().authorizeRequests().antMatchers("/oauth/**", "/login/**", "/logout/**").permitAll()
                // 其余所有请求全部需要鉴权认证
                .anyRequest().authenticated()
                // 关闭跨域保护;
                .and().csrf().disable();*/
    }

    @Bean
    public NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

}
