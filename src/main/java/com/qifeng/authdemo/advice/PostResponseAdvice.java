package com.qifeng.authdemo.advice;

import com.qifeng.authdemo.view.JsonView;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.print.attribute.standard.JobSheets;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/12 18:09
 */
@ControllerAdvice
public class PostResponseAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        //Controller的返回结果在这里封装
        JsonView<Object> jsonView = new JsonView<>();
        jsonView.setCode(200);
        jsonView.setMessage("success");
        jsonView.setData(o);
        return jsonView;
    }
}
