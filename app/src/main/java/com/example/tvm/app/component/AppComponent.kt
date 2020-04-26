package com.example.tvm.app.component

import com.example.tvm.app.TvmApp
import com.example.tvm.app.module.AppModule
import com.example.tvm.cache.injection.CacheModule
import com.example.tvm.data.injection.DataModule
import com.example.tvm.remote.injection.RemoteModule
import com.example.tvm.shared.module.BaseModule
import com.example.tvm.ui.injection.module.ActivityBindingModule
import com.example.tvm.ui.injection.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [BaseModule::class],
    modules = [AppModule::class]
)
interface AppComponent  {

    fun inject(application: TvmApp)

    @Component.Factory
    interface Factory {

        @BindsInstance
        fun create(application: TvmApp): AppComponent
    }

}