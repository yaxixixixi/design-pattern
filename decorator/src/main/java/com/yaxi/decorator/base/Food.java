package com.yaxi.decorator.base;

/**
 * Created by yaxi on 2017/12/7.
 */

public abstract class Food {

    public String description = "unknown food";
    public String getDescription(){
        return description;
    }

    public abstract double getPrice();


    /**
     * 不同的调料可以表现不同的味道，甚至多种，但基本上是和描述一样的道理，因此不做处理
     */
    public abstract void delicious();


}
