package com.example.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        boolean flag = true;
        System.out.println ("Welcome to " + request.getRequestURI ());
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println ("postHandle --> " + modelAndView.getViewName ());
        System.out.println (modelAndView.getModel ().get ("key"));
        System.out.println ( request.getRequestURL () );
        System.out.println (handler.getClass ().getDeclaredClasses ());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
