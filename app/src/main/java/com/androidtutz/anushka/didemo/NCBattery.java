package com.androidtutz.anushka.didemo;

import android.util.Log;

import javax.inject.Inject;

public class NCBattery implements Battery {
    private static final String TAG = "SmartPhone";

    @Inject
    public NCBattery() {
    }

    @Override
    public void showType() {
        Log.d(TAG, "This battery is a nickle cadmium battery......... ");
    }
}
