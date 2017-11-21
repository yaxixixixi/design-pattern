package com.yaxi.singlepattern;

import android.util.Log;

/**双重检查锁单例模式
 * Created by yaxi on 2017/11/21.
 */

public class DoubleCheckInstance {

    private static final String TAG = DoubleCheckInstance.class.getSimpleName();
    private static DoubleCheckInstance instance = null;

    private DoubleCheckInstance(){}


    /**
     * 如果JDK的version >= 1.5，使用private volatile static DoubleCheckInstance instance = null;
     * @return
     */
    public static DoubleCheckInstance getInstance(){
        if (instance == null){
            synchronized (DoubleCheckInstance.class){
                if (instance == null){
                    instance = new DoubleCheckInstance();
                }
            }
        }

        return instance;
    }


    public void doSth(){
        Log.i(TAG, "doSth: "+instance.hashCode());
    }
}
