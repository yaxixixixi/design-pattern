package com.yaxi.singlepattern;

import android.util.Log;

/**懒汉式单例模式
 * Created by yaxi on 2017/11/21.
 */

public class LazyInstance {
    private static final String TAG = LazyInstance.class.getSimpleName();
    private static LazyInstance instance = null;

    private LazyInstance(){}

    public static synchronized LazyInstance getInstance(){
        if (instance == null)
            instance = new LazyInstance();

        return instance;
    }

    public void doSth(){
        Log.i(TAG, "doSth: "+instance.hashCode());
    }
}


