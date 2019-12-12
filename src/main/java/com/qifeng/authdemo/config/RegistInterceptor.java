package com.qifeng.authdemo.config;

import com.qifeng.authdemo.interceptor.UrlInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/12 17:44
 */
@Configuration
public class RegistInterceptor extends WebMvcConfigurationSupport {

    @Autowired
    private UrlInterceptor urlInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //可设置拦截路径和非拦截路径
        registry.addInterceptor(urlInterceptor).addPathPatterns("/**");
    }
}
