package com.yaxi.singlepattern;

import android.util.Log;

/**饿汉式单例模式
 * Created by yaxi on 2017/11/21.
 */

public class HungryInstance {

    private static final HungryInstance instance = new HungryInstance();
    private static final String TAG = HungryInstance.class.getSimpleName();

    private HungryInstance(){}

    public static HungryInstance getInstance(){
        return instance;
    }

    public void doSth(){
        Log.i(TAG, "doSth: "+instance.hashCode());
    }
}
