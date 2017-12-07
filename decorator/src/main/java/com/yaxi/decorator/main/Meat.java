package com.yaxi.decorator.main;

import com.yaxi.decorator.base.Food;

/**
 * Created by yaxi on 2017/12/7.
 */

public class Meat extends Food{

    public Meat() {
        description = "米饭";
    }

    @Override
    public double getPrice() {
        return 6;
    }

    @Override
    public void delicious() {

    }
}
