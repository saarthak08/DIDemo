package com.androidtutz.anushka.didemo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    private static final String TAG = "SmartPhone";
    int memorySize;

    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }

    @Provides
     MemoryCard provideMemoryCard()
    {
        Log.d(TAG, " memory size ="+memorySize+"......... ");
        return new MemoryCard(memorySize);
    }
}
