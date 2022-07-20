package com.codepractice.kelin.design_pattern.proxy_pattern;


import android.util.Log;

//代理模式 真实角色
public class ImplJapanOrderService  implements  OrderService{
    @Override
    public int saveOrder() {
        Log.e("ImplJapanOrderService","Japan Order");
        return 100;
    }
}
