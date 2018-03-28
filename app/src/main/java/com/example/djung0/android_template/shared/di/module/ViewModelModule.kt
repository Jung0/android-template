package com.example.djung0.android_template.shared.di.module

import android.arch.lifecycle.ViewModelProvider
import com.example.djung0.android_template.shared.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}