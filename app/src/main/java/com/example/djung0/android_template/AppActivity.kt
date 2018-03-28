package com.example.djung0.android_template

import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.djung0.android_template.shared.di.Injectable
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class AppActivity : AppCompatActivity(), HasSupportFragmentInjector, Injectable {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var androidInjetor: DispatchingAndroidInjector<android.support.v4.app.Fragment>

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = androidInjetor
}