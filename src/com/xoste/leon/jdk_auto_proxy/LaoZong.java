package com.xoste.leon.jdk_auto_proxy;

/**
 * 真实对象
 * @author Xoste
 */
public class LaoZong implements GongNeng {
    @Override
    public void chifan() {
        System.out.println("吃饭");
    }

    @Override
    public void mubiao() {
        System.out.println("目标");
    }
}
