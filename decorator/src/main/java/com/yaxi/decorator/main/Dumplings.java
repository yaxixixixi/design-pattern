package com.yaxi.decorator.main;

import com.yaxi.decorator.base.Food;

/**
 * Created by yaxi on 2017/12/7.
 */

public class Dumplings extends Food{


    public Dumplings() {
        description = "饺子";
    }

    @Override
    public double getPrice() {
        return 20.00;
    }

    @Override
    public void delicious() {

    }
}
