package com.xoste.leon.cglib_auto_proxy;

//import org.springframework.cglib.proxy.Enhancer;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author Xoste
 */
public class Women {
    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
////        enhancer.setSuperclass(LaoZong.class);
////        enhancer.setCallback(new MiShu());
////        LaoZong laoZong = (LaoZong) enhancer.create();
////        laoZong.chifan();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(LaoZong.class);
        enhancer.setCallback(new MiShu());
        LaoZong laoZong = (LaoZong) enhancer.create();
        laoZong.chifan();
        laoZong.mubiao();
    }
}
