package com.codepractice.kelin.design_pattern.proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
//优势：当需要代理多个真实角色（实现了同一个接口，比如有多个国家的OrderService ），不需要创建多个对应的代理类
public class ProxyDynamicOrder implements InvocationHandler {

    private Object orderService;  //持有真实角色

    public Object getOrderService() {
        return orderService;
    }

    public void setOrderService(Object orderService) {  //设置需要代理的真实角色
        this.orderService = orderService;
    }

    //通过 Proxy 动态创建真实角色
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        return method.invoke(orderService, objects);  //通过反射执行真实角色的行为方法
    }
}

//   动态代理模式示例代码 

//创建动态代理类实例 
//   ProxyDynamicOrder proxyDynamicOrder = new ProxyDynamicOrder(); 

//   国内订单       
//   OrderService orderService = new ImplOrderService();      
//   proxyDynamicOrder.setOrderService(orderService);       
//   OrderService orderService1 = (OrderService) proxyDynamicOrder.getProxyInstance();       
//   orderService1.saveOrder();     
//
//   日本代购订单       
//   OrderService japanOrderService = new ImplJapanOrderService();      
//   proxyDynamicOrder.setOrderService(japanOrderService);        
//   OrderService japanOrderService1 = (OrderService) proxyDynamicOrder.getProxyInstance();        
//   japanOrderService1.saveOrder();    买到日本产品    
//
//   韩国代购订单        
//   OrderService koreaOrderService = new ImplKoreaOrderService();        
//   proxyDynamicOrder.setOrderService(koreaOrderService);        
//   OrderService koreaOrderService1 = (OrderService) proxyDynamicOrder.getProxyInstance();     
//   koreaOrderService1.saveOrder();    买到韩国产品

//后续
//1.retrofit中动态代理思想
//2.动态代理背后的原理


