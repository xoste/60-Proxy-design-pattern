package com.xoste.leon.cglib_auto_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
//import org.springframework.cglib.proxy.MethodInterceptor;
//import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * @author Xoste
 */
public class MiShu implements MethodInterceptor {
    /**
     * 用cglib-2.2.2.jar包中的类实现
     * @param o Object
     * @param method method
     * @param objects Object[]
     * @param methodProxy methodProxy
     * @return Object
     * @throws Throwable throwable
     */
    /*@Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // invoke 调用子类重写方法  invokeSuper 调用父类方法
        System.out.println("预约时间");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("记录访客时间");
        return invoke;
    }*/


    /**
     * 用spring-core-5.2.6.RELEASE.jar包中的类实现
     * @param o Object
     * @param method method
     * @param objects Object[]
     * @param methodProxy methodProxy
     * @return Object
     * @throws Throwable throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // invoke调用子类重写方法 invokerSuper 调用父类方法
        System.out.println("预约时间");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("记录访客时间");
        return invoke;
    }
}
