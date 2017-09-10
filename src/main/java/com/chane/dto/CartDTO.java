package com.chane.dto;

import lombok.Data;

/**
 * 购物车
 * Created by chane on 2017/9/10.
 */
@Data
public class CartDTO {
    /**商品Id*/
    private String productId;

    /**数量**/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
