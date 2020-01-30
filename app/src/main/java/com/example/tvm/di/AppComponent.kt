package com.example.tvm.di

import com.example.tvm.TvmApp
import com.example.tvm.ui.di.module.ActivityBindingModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class
    ]
)
interface AppComponent : AndroidInjector<TvmApp> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: TvmApp): AppComponent
    }

}