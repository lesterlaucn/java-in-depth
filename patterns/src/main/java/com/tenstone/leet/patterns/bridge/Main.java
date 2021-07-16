package com.tenstone.leet.patterns.bridge;

/**
 * Created by liuyuancheng on 2021/7/16  <br/>
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("HELLO, CHINA."));
        Display d2 = new CountDisplay(new StringDisplayImpl("HELLO, WORLD."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("HELLO, UNIVERSE."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

}
