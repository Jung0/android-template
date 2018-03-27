package com.example.djung0.android_template.shared.di.module

import com.example.djung0.android_template.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [(FragmentModule::class)])
    internal abstract fun mainActivity(): MainActivity
}