package com.androidtutz.anushka.didemo;


import dagger.Module;
import dagger.Provides;

@Module
public class NCBatteryModule  {

    @Provides
    Battery NCBatteryProvider(NCBattery ncBattery)
    {
        ncBattery.showType();
        return ncBattery;
    }
}
