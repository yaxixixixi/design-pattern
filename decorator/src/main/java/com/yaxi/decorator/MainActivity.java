package com.yaxi.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yaxi.decorator.base.Food;
import com.yaxi.decorator.decorator.Chili;
import com.yaxi.decorator.decorator.Vnegar;
import com.yaxi.decorator.main.Dumplings;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.test();
    }


    /**
     * 做一份重辣（3分辣椒）酸的饺子
     */
    public void test(){
        Food dumplings = new Dumplings();
        dumplings = new Vnegar(dumplings);
        dumplings = new Chili(dumplings);
        dumplings = new Chili(dumplings);

        String description = dumplings.getDescription();
        double price = dumplings.getPrice();

        Log.i(TAG, "test: description:" + description
        +"\nprice = " + price);
    }
}
