package com.yaxi.strategy.data;

import android.util.Log;

import com.yaxi.strategy.behavior.FlyB;
import com.yaxi.strategy.behavior.FlyBehavior;

/**
 * Created by yaxi on 2017/11/21.
 */

public class BirdB extends Bird {


    private static final String TAG = BirdB.class.getSimpleName();
    private FlyBehavior flyB;

    public BirdB(){
        flyB = new FlyB();
    }

    @Override
    public void display() {
        Log.i(TAG, "display: ");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void run() {
        super.run();
    }


    public void performFly(){
        flyB.fly();
    }
}
