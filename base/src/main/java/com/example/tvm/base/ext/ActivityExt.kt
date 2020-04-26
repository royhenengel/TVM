package com.example.tvm.base.ext

import android.app.Activity
import com.example.tvm.base.component.BaseComponent

fun Activity.baseComponent(): BaseComponent = application.baseComponent()