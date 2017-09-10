package com.chane.exception;

import com.chane.enums.ResultEnum;

/**
 * Created by chane on 2017/9/10.
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());

        this.code= resultEnum.getCode();
    }
}
