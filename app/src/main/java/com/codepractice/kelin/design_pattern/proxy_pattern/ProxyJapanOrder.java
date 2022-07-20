package com.codepractice.kelin.design_pattern.proxy_pattern;


import android.util.Log;

//代理模式 代理角色
public class ProxyJapanOrder implements OrderService {

    private OrderService orderService;   //代理角色持有真实角色

    public OrderService getOrderService() {
        return  orderService;
    }

    public void setOrderService(OrderService orderService){  //设置需要代理的真实角色
        this.orderService=orderService;
    }

    @Override
    public int saveOrder() {
        Log.e("ProxyJapanOrder","Japan Proxy");
        return orderService.saveOrder();
    }
}
