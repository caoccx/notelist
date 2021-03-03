package com.itcc.boot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by caocaixia on 2021/2/24 12:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    int code;
    String message;
    T data;

    public CommonResult(int code, String message) {
        this(code,message,null);
    }
}
