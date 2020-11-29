package com.xoste.leon.jdk_auto_proxy;

import java.lang.reflect.Proxy;

/**
 * 访问对象
 *
 * @author Xoste
 */
public class Women {
    public static void main(String[] args) {
        MiShu miShu = new MiShu();
        /*
        * 第一个参数：反射时使用的类加载器
        * 第二个参数：Proxy代理要实现的接口
        * 第三个参数：通过接口对象调用方法的时候，需要调用哪个类的invoke方法
        * */
        GongNeng gongNeng = (GongNeng) Proxy.newProxyInstance(Women.class.getClassLoader(), new Class[]{GongNeng.class}, miShu);
        gongNeng.chifan();
        gongNeng.mubiao();
    }
}
