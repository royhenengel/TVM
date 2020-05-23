package com.example.tvm.app.startup

import android.content.Context

interface ComponentInitializer<T> {

    fun dependencies(): List<Class<out ComponentInitializer<out Any>>>?

    fun create(context: Context): T

}