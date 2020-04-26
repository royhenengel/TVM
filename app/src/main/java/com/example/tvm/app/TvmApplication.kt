package com.example.tvm.app

import android.app.Application
import com.example.tvm.BuildConfig
import com.example.tvm.app.component.AppComponent
import com.example.tvm.app.component.DaggerAppComponent
import com.example.tvm.base.component.DaggerBaseComponent
import timber.log.Timber

class TvmApplication: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        val baseComponent = DaggerBaseComponent.factory().create(this)
        appComponent = DaggerAppComponent.factory().create(baseComponent).also { it.inject(this) }

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}