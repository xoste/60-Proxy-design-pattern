package com.xoste.leon.static_proxy;

/**
 * 真实对象
 * @author Xoste
 */
public class LaoZong implements GongNeng {
    private String name;

    public LaoZong() {
    }

    public LaoZong(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void zhidingxiaomubiao() {
        System.out.println("制定小目标");
    }

    @Override
    public void chifan() {
        System.out.println("老总吃饭");
    }
}
