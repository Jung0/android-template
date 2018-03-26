package com.example.djung0.android_template

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import com.example.djung0.android_template.shared.di.DaggerAppComponent
import com.example.djung0.android_template.shared.di.Injectable
import com.example.djung0.android_template.shared.di.module.ApiModule
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerApplication
import dagger.android.support.HasSupportFragmentInjector

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

    private fun setupActivityLifecycle() = registerActivityLifecycleCallbacks(
            object : Application.ActivityLifecycleCallbacks {

                override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
                    activity?.let {
                        handleActivity(it)
                    }
                }

                override fun onActivityStarted(activity: Activity?) {
                    // ...
                }
                override fun onActivityResumed(activity: Activity?) {
                    // ...
                }
                override fun onActivityPaused(activity: Activity?) {
                    // ...
                }
                override fun onActivityStopped(activity: Activity?) {
                    // ...
                }
                override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
                    // ...
                }
                override fun onActivityDestroyed(activity: Activity?) {
                    // ...
                }
            })

    private fun handleActivity(activity: Activity) {
        if (activity is Injectable || activity is HasSupportFragmentInjector) {
            AndroidInjection.inject(activity)
        }
        if (activity is FragmentActivity) {
            activity.supportFragmentManager.registerFragmentLifecycleCallbacks(
                    object : FragmentManager.FragmentLifecycleCallbacks() {
                        override fun onFragmentCreated(fm: FragmentManager, f: Fragment, s: Bundle?) {
                            if (f is Injectable) {
                                AndroidSupportInjection.inject(f)
                            }
                        }
                    }, true)
        }

    }
}