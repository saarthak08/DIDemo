package com.androidtutz.anushka.didemo;



/*
This is an alternate way of injecting the NCBattery class mainly the battery interface.
This method isn't used in this project but can be used by adding this module class in SmartPhoneComponent annotation.
*/


import dagger.Binds;
import dagger.Module;

@Module
public abstract class NCBatteryModuleAlternate {

    @Binds
    abstract Battery NCBatteryProvider(NCBattery ncBattery);
}
