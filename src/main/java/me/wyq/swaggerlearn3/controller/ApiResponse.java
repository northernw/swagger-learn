package me.wyq.swaggerlearn3.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wangyuanqing1
 * 2019-09-16
 */
@ToString
@Getter
@Setter
public class ApiResponse<T> {
    private Integer code;
    private String msg;
    private Boolean success;
    private T data;

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> response = new ApiResponse<T>();
        response.setData(data);
        response.setCode(1);
        response.setSuccess(Boolean.TRUE);
        return response;
    }
}
