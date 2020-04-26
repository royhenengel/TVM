package com.example.tvm.base.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named

const val APPLICATION_CONTEXT = "APPLICATION_CONTEXT"

@Module
object BaseModule {

    @Named(APPLICATION_CONTEXT)
    @Provides
    @JvmStatic
    fun provideApplicationContext(application: Application): Context = application.applicationContext

}