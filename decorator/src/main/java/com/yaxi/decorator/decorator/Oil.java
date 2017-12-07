package com.yaxi.decorator.decorator;

import com.yaxi.decorator.base.Food;

/**油
 * Created by yaxi on 2017/12/7.
 */

public class Oil extends CondimentDecrator{

    private Food food;

    public Oil(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + "，油";
    }

    @Override
    public double getPrice() {
        return food.getPrice() + 3.5;
    }

    @Override
    public void delicious() {

    }
}
