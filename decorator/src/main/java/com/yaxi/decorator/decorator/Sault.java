package com.yaxi.decorator.decorator;

import com.yaxi.decorator.base.Food;

/**盐
 * Created by yaxi on 2017/12/7.
 */

public class Sault extends CondimentDecrator{

    private Food food;

    public Sault(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + "sault";
    }

    @Override
    public double getPrice() {
        return food.getPrice() + 1.2;
    }

    @Override
    public void delicious() {

    }
}
