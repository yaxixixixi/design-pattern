package com.yaxi.decorator.main;

import com.yaxi.decorator.base.Food;

/**
 * Created by yaxi on 2017/12/7.
 */

public class Noodles extends Food{


    public Noodles()
    {
        description = "面条";
    }

    @Override
    public double getPrice() {
        return 15.00;
    }

    @Override
    public void delicious() {

    }
}
