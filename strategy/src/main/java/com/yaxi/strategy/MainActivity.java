package com.yaxi.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yaxi.strategy.data.BirdA;
import com.yaxi.strategy.data.BirdB;
import com.yaxi.strategy.data.BirdC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Test.testFly();
    }
}
