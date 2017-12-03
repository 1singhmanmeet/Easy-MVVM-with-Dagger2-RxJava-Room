package com.example.multimeet.things2do.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by multimeet on 28/11/17.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application){
        return application;
    }

    // Method for providing UserDataSource.


}
