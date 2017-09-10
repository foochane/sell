package com.chane.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by chane on 2017/9/10.
 */
@Data
public class ResultVO<T> {
    /** 提示编码*/
    private Integer code;

    /** 提示信息*/
    private String msg;

    /** 具体内容*/
    private T data;
}
