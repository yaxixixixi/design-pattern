package com.yaxi.observer.observer;

import android.util.Log;

/**
 * Created by yaxi on 2017/11/21.
 */

public class ObserverImpl implements IObserver{
    private static final String TAG = ObserverImpl.class.getSimpleName();

    @Override
    public void update(String msg) {
        Log.i(TAG, "update: "+msg);
    }

    @Override
    public String getName() {
        return TAG;
    }
}
