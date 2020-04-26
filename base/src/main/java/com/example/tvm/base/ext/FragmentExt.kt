package com.example.tvm.base.ext

import android.app.Application
import androidx.fragment.app.Fragment
import com.example.tvm.base.component.BaseComponent

fun Fragment.baseComponent(): BaseComponent {
    val applicationContext = context?.applicationContext

    require(applicationContext is Application) {
        "Context is $context and not an instance of Application "
    }

    return applicationContext.baseComponent()
}