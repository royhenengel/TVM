package com.example.tvm.app

import android.app.Application
import com.example.tvm.app.component.AppComponent
import com.example.tvm.app.component.DaggerAppComponent
import com.example.tvm.app.startup.AppInitializer
import com.example.tvm.base.component.DaggerBaseComponent
import javax.inject.Inject

class TvmApplication : Application() {

    private lateinit var appComponent: AppComponent

    @Inject
    lateinit var appInitializer: AppInitializer

    override fun onCreate() {
        super.onCreate()

        val baseComponent = DaggerBaseComponent.factory().create(this)
        appComponent = DaggerAppComponent.factory().create(baseComponent).also { it.inject(this) }

        appInitializer.discoverAndInit()
    }

}