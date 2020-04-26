package com.example.tvm.base.ext

import android.app.Application
import android.content.Context
import com.example.tvm.base.component.BaseComponent
import com.example.tvm.base.component.DaggerBaseComponent

fun Context.baseComponent(): BaseComponent {
    require(this is Application) {
        "Context is $this is not an instance of Application "
    }

    return DaggerBaseComponent.factory()
        .create(application = this)
}