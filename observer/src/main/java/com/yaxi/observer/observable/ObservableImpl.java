package com.yaxi.observer.observable;

import android.util.Log;

import com.yaxi.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaxi on 2017/11/21.
 */

public class ObservableImpl implements IObservable {


    private static final String TAG = ObservableImpl.class.getSimpleName();
    private List<IObserver> observerList = new ArrayList<>();

    @Override
    public boolean addObserver(IObserver observer) {

        if (observerList!= null && !observerList.contains(observer)){
            observerList.add(observer);
            Log.i(TAG, "addObserver: "+observer.getName());
            return true;
        }
        return false;
    }

    @Override
    public void addObserverCollection(List<IObserver> observers) {

    }

    @Override
    public boolean removeObserver(IObserver observer) {
        if (observerList != null && observerList.size() > 0){
            for (IObserver iObserver : observerList) {
                if (iObserver.equals(observer)){
                    observerList.remove(iObserver);
                    Log.i(TAG, "removeObserver: "+observerList.size());
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public void removeAll() {
        if (observerList!= null){
            observerList.clear();
        }
    }

    @Override
    public void change() {
        for (IObserver iObserver : observerList) {
            iObserver.update("source has changed!");
        }
    }

    @Override
    public void change2() {
        for (IObserver iObserver : observerList) {
            iObserver.update("source has changed twice!");
        }
    }

    @Override
    public void change3() {
        for (IObserver iObserver : observerList) {
        iObserver.update("source has changed three!");
        }
    }
}
