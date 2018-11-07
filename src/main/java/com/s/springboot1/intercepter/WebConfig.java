package com.s.springboot1.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        // 添加自定义拦截器和拦截路径
//        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/**").excludePathPatterns("/a", "/b","/hello");
//
//    }
}
