package com.yaxi.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yaxi.observer.observable.IObservable;
import com.yaxi.observer.observable.ObservableImpl;
import com.yaxi.observer.observer.ObserverImpl;
import com.yaxi.observer.observer.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        simulation();


    }


    public void simulation() {

        IObservable source = new ObservableImpl();

        ObserverImpl observer = new ObserverImpl();
        source.addObserver(observer);
        Subscriber observer1 = new Subscriber();
        source.addObserver(observer1);
        source.change();
        source.removeObserver(observer);
        source.change2();
        source.removeObserver(observer1);
        source.change3();


    }
}
