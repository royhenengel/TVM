package com.example.tvm.injection

import com.example.tvm.TvmApp
import com.example.tvm.cache.injection.CacheModule
import com.example.tvm.data.injection.DataModule
import com.example.tvm.remote.injection.RemoteModule
import com.example.tvm.ui.injection.module.ActivityBindingModule
import com.example.tvm.ui.injection.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        ViewModelModule::class,
        DataModule::class,
        RemoteModule::class,
        CacheModule::class
    ]
)
interface AppComponent : AndroidInjector<TvmApp> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: TvmApp): AppComponent
    }

}