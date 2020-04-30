package com.example.tvm.base.component

import android.app.Application
import android.content.Context
import com.example.tvm.base.logging.Logger
import com.example.tvm.base.module.APPLICATION_CONTEXT
import com.example.tvm.base.module.BaseModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(
    modules = [BaseModule::class]
)
interface BaseComponent {

    @Named(APPLICATION_CONTEXT)
    fun provideApplicationContext(): Context

    fun provideLogger(): Logger

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance application: Application): BaseComponent
    }
}