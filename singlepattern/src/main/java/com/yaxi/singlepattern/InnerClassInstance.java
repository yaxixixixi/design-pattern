package com.yaxi.singlepattern;

import android.util.Log;

/**
 * 静态内部类单例模式
 * Created by yaxi on 2017/11/21.
 */

public class InnerClassInstance {


    private static final String TAG = InnerClassInstance.class.getSimpleName();

    private InnerClassInstance(){}

    private static class InnerClassInstanceHolder{
        private static InnerClassInstance instance = new InnerClassInstance();
    }

    public static InnerClassInstance getInstance(){
        return InnerClassInstanceHolder.instance;
    }

    public void doSth(){
        Log.i(TAG, "doSth: "+InnerClassInstanceHolder.instance.hashCode());
    }
}
