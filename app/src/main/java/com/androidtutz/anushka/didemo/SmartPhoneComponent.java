package com.androidtutz.anushka.didemo;

import dagger.Component;

@Component(modules = {MemoryCardModule.class, NCBatteryModule.class,ApplicationContextModule.class})
public interface SmartPhoneComponent {
   // SmartPhone getSmartPhone();

    void inject(MainActivity mainActivity);
}
