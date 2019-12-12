package com.qifeng.authdemo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/12 17:37
 * url拦截器，拦截每一个请求，做请求预处理，和鉴权
 * 编写完拦截器实现，注意注册拦截器（webmvc...）
 */
@Component
public class UrlInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //根据当前用户携带的token执行鉴权先关
        //鉴权是否通过返回true or false
        //鉴权通过在request中预设用户信息，例如预设userId，在Controller中使用@RequestAttribute获取
        request.setAttribute("userId", new Random().nextInt(10));
        request.setAttribute("userName", "二哈");
        request.setAttribute("password", "123");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
