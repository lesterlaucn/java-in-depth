package com.tenstone.juc.locks;

import sun.misc.Unsafe;

/**
 * Created by liuyuancheng on 2022/1/28  <br/>
 *
 * @author liuyuancheng
 */
public class DemoTest {

    private static Integer num  = 12009;

    public static void main(String[] args) {
        System.out.println(System.identityHashCode(num));
        num++;
        System.out.println(System.identityHashCode(num));
    }
}
