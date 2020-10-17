package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
//表明是一个配置类
@EnableWebSecurity
//web认证
public class   SpringSecurityConfig extends WebSecurityConfigurerAdapter {


    //修改配置用户密码编解码方式：
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new MyPasswordEncoder())
                .withUser("admin")
                .password(new MyPasswordEncoder().encode("123456"))
                .roles("ADMIN ");
        //指定用户

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                //
                .antMatchers("/").permitAll()
                //放行根目录
                .anyRequest().authenticated()

                .and()

                .logout().permitAll()
                //登出
                .and()
                .formLogin();
        //登入
        http.csrf().disable();
    }


    @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/js/**","/css/**","/images/**");
        //指定匹配
    }
}
