package com.example.demo.config;

import org.springframework.security.crypto.password.PasswordEncoder;


/*
 实现PassWordEnconding来实现创建自定义密码编解码类：



 */
public class MyPasswordEncoder implements PasswordEncoder {
    final static String SALT ="123456";

    @Override
    public String encode(CharSequence charSequence){
        System.out.println(charSequence + SALT);
        //输出密码和盐
        return charSequence + SALT;
    }
    @Override
    public boolean matches(CharSequence charSequence,String s){
        System.out.println("加密的密码："+s);
        System.out.println("未加密的密码："+charSequence);
        return s.equalsIgnoreCase(charSequence+SALT);
        //利用equals把密码进行的对应
    }
}
