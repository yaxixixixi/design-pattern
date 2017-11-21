package com.yaxi.singlepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        for (int i = 0; i < 3; i++) {
            DoubleCheckInstance.getInstance().doSth();
            EnumInstance.INSTANCE.doSomething();
            HungryInstance.getInstance().doSth();
            InnerClassInstance.getInstance().doSth();
            LazyInstance.getInstance().doSth();
            Log.i(TAG, "onCreate: --------------------------------------------------");
        }


    }
}
