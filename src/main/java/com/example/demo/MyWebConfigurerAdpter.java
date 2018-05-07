package com.example.demo;

import com.example.demo.interceptor.TestInterceptor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;
@Configuration
public class MyWebConfigurerAdpter implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.err.println ("拦截器配置加载成功" );
        registry.addInterceptor (new TestInterceptor ()).addPathPatterns ("/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 这有什么用？  不用写Controller就可以请求，
        System.err.println ("login is on" );
        // 不走拦截器
        registry.addViewController ("/login").setViewName ("login");
    }
}
