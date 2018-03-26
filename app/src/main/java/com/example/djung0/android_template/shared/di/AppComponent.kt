package com.example.djung0.android_template.shared.di

import com.example.djung0.android_template.AppApplication
import com.example.djung0.android_template.shared.di.module.ActivityModule
import com.example.djung0.android_template.shared.di.module.ApiModule
import com.example.djung0.android_template.shared.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<AppApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: AppApplication) : Builder

        fun apiModule(apiModule: ApiModule): Builder

        fun build(): AppComponent
    }

    override fun inject(application: AppApplication)
}