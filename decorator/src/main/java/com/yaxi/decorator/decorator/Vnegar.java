package com.yaxi.decorator.decorator;

import com.yaxi.decorator.base.Food;

/**醋
 * Created by yaxi on 2017/12/7.
 */

public class Vnegar extends CondimentDecrator{
    private Food food;

    public Vnegar(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + "醋";
    }

    @Override
    public double getPrice() {
        return food.getPrice() + 1.9;
    }

    @Override
    public void delicious() {

    }
}
