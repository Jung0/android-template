package com.example.djung0.android_template

import com.example.djung0.android_template.shared.di.AppInjector.setupActivityLifecycle
import com.example.djung0.android_template.shared.di.DaggerAppComponent
import com.example.djung0.android_template.shared.di.module.ApiModule
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .application(this)
                .apiModule(ApiModule(this.getString(R.string.domain_api)))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        setupActivityLifecycle()
    }
}