package com.xoste.leon.jdk_auto_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理对象
 * @author Xoste
 */
public class MiShu implements InvocationHandler  {
    private LaoZong laoZong = new LaoZong();
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("预约时间");
        Object invoke = method.invoke(laoZong, args);
        System.out.println("记录访客信息");
        return invoke;
    }
}
