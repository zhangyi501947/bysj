package com.zy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
//@EnableWebMvc   //导入一个类DelegatingWebMvcConfiguration
public class MyMvcConfig implements WebMvcConfigurer {
    //public interface ViewResolver视图解析器。实现了跳转（视图解析器）的类，
    // 我们把这个类当成跳转(原来是   getCandidateViews类

    @Bean
    public ViewResolver MyViewResolver(){
        return new MyViewResolver();
    }
    //自定义视图解析器
    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");

    }

    @Bean("localeResolver")
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}

