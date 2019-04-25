package com.androidtutz.anushka.didemo;

import android.app.Application;

public class App extends Application {
    private static App app;
    private SmartPhoneComponent smartPhoneComponent;

    public static App getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        //SmartPhoneComponent smartPhoneComponent=DaggerSmartPhoneComponent.create();
        //smartPhone=smartPhoneComponent.getSmartPhone();
        smartPhoneComponent=DaggerSmartPhoneComponent.builder().memoryCardModule(new MemoryCardModule(10)).applicationContextModule(new ApplicationContextModule(getApp()))
                .build();
    }

    public SmartPhoneComponent getSmartPhoneComponent() {
        return smartPhoneComponent;
    }
}
