package com.yaxi.strategy.data;

import android.util.Log;

import com.yaxi.strategy.behavior.FlyBehavior;
import com.yaxi.strategy.behavior.FlyC;

/**
 * Created by yaxi on 2017/11/21.
 */

public class BirdC extends Bird {


    private static final String TAG = BirdC.class.getSimpleName();
    private FlyBehavior flyC;

    public BirdC(){
        flyC = new FlyC();
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
        flyC.fly();
    }









}
