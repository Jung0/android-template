package com.example.djung0.android_template.shared.di.module

import com.example.djung0.android_template.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributesMainFragment(): MainFragment
}