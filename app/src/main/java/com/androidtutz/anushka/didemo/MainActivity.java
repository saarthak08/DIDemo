package com.androidtutz.anushka.didemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

     @Inject
     Battery battery;

     @Inject
     Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getApp().getSmartPhoneComponent().inject(this);
        smartPhone.makeACall();
        battery.showType();
        Toast.makeText(context,"Hello, context is injected",Toast.LENGTH_SHORT).show();
    }
}
