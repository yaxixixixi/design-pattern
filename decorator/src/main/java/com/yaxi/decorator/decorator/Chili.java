package com.yaxi.decorator.decorator;

import com.yaxi.decorator.base.Food;

/**辣椒
 * Created by yaxi on 2017/12/7.
 */

public class Chili extends CondimentDecrator{


    private Food food;

    public Chili(Food food) {
        this.food = food;
    }


    @Override
    public String getDescription() {
        return food.getDescription()+",辣椒";
    }

    @Override
    public double getPrice() {
        return food.getPrice() + 0.8;
    }

    @Override
    public void delicious() {

    }
}
