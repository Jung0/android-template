package com.example.djung0.android_template.shared.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [
    ApiModule::class,
    RepositoryModule::class,
    ViewModelModule::class
])
class AppModule {
    @Singleton
    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }
}