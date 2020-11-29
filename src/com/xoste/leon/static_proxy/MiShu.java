package com.xoste.leon.static_proxy;

/**
 * 代理对象
 * @author Xoste
 */
public class MiShu implements GongNeng {
    private LaoZong laoZong = new LaoZong("云云");
    @Override
    public void zhidingxiaomubiao() {
        System.out.println("约定时间");
        laoZong.zhidingxiaomubiao();
        System.out.println(" 把访客信息备注");
    }

    @Override
    public void chifan() {
        System.out.println("约定时间");
        laoZong.zhidingxiaomubiao();
        System.out.println("把访客信息备注");
    }
}
