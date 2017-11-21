package com.yaxi.strategy.behavior;

/**
 * Created by yaxi on 2017/11/21.
 */

public class FlyB implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞行方式B");
    }
}
