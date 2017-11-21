package com.yaxi.strategy.data;

import android.util.Log;

import com.yaxi.strategy.behavior.FlyA;
import com.yaxi.strategy.behavior.FlyBehavior;

/**
 * Created by yaxi on 2017/11/21.
 */

public class BirdA extends Bird{


    private static final String TAG = BirdA.class.getSimpleName();


    private FlyBehavior mFlyBehavior;

    public BirdA(){
        mFlyBehavior = new FlyA();
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
        mFlyBehavior.fly();
    }

}
