package com.yaxi.decorator.decorator;

import com.yaxi.decorator.base.Food;

/**糖
 * Created by yaxi on 2017/12/7.
 */

public class Sugar extends CondimentDecrator{



    private Food food;

    public Sugar(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + "sugar";
    }

    @Override
    public double getPrice() {
        return food.getPrice() + 2.0;
    }

    @Override
    public void delicious() {

    }
}
