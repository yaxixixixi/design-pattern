package com.yaxi.observer.observable;

import com.yaxi.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 被观察者
 * Created by yaxi on 2017/11/21.
 */

public interface IObservable {

    boolean addObserver(IObserver observer);

    void addObserverCollection(List<IObserver> observers);

    boolean removeObserver(IObserver observer);

    void removeAll();

    void change();

    void change2();

    void change3();
}
