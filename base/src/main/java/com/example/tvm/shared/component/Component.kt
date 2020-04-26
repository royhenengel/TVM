package com.example.tvm.shared.component

import android.app.Application
import android.content.Context
import com.example.tvm.shared.module.APPLICATION_CONTEXT
import com.example.tvm.shared.module.BaseModule
import com.example.tvm.shared.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(
    modules = [
        BaseModule::class,
        ViewModelFactoryModule::class
    ]
)
interface BaseComponent {

    @Named(APPLICATION_CONTEXT)
    fun provideApplicationContext(): Context

    @Component.Factory
    interface Factory {

        @BindsInstance
        fun create(application: Application): BaseComponent
    }
}