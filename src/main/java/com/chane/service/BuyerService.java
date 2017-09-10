package com.chane.service;

import com.chane.dto.OrderDTO;

/**
 * 买家
 * Created by chane on 2017/9/10.
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
