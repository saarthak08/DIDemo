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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmartPhoneComponent smartPhoneComponent=DaggerSmartPhoneComponent.create();
        //smartPhone=smartPhoneComponent.getSmartPhone();
        smartPhoneComponent.inject(this);
        smartPhone.makeACall();
        battery.showType();
    }
}
