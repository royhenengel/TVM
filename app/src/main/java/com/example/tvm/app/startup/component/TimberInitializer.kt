package com.example.tvm.app.startup.component

import android.content.Context
import com.example.tvm.BuildConfig
import com.example.tvm.app.startup.ComponentInitializer
import com.example.tvm.base.logging.TimberLogger

class TimberLoggerInitializer: ComponentInitializer<TimberLogger> {

    override fun dependencies(): List<Class<out ComponentInitializer<out Any>>>? = null

    override fun create(context: Context): TimberLogger {
        TimberLogger.initialize(BuildConfig.DEBUG)

        return TimberLogger
    }
}