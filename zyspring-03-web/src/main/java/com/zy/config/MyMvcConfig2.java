package com.zy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;
//步骤1  在官网Spring Boot Features中7.1.1中，找到出处下
@Configuration
public class MyMvcConfig2 implements WebMvcConfigurer {
    //步骤3  ViewResolver实现视图解析器
    @Bean
    public ViewResolver MyViewResolver2(){
        return new MyViewResolver2();
    }
//步骤2  ContentNegotiatingViewResolver类实现ViewResolver接口的方法
 public static class MyViewResolver2 implements ViewResolver {

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        return null;
    }
    //步骤4  在 DispatcherServlet 类的 protected void doDispatch 方法打断点调试，在this的viewResolvers中，知道自己的MyMvcConfig2


}



}
