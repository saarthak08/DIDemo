package com.androidtutz.anushka.didemo;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationContextModule {
    private Application application;

    public ApplicationContextModule(Application application) {
        this.application = application;
    }

    @Provides
    public Context getApplicationContext()
    {
        return application;
    }
}
