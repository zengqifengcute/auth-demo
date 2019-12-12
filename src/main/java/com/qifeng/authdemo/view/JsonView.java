package com.qifeng.authdemo.view;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/12 18:08
 */
public class JsonView<T> extends View {
    private Integer code;
    private String message;
    private T data;

    public JsonView(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonView(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonView() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
