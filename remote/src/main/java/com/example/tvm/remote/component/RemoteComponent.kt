package com.example.tvm.remote.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.remote.module.RemoteModule
import dagger.Component

@Component(
    dependencies = [BaseComponent::class],
    modules = [RemoteModule::class]
)
interface RemoteComponent {

    @Component.Factory
    interface Factory {

        fun create(baseComponent: BaseComponent): RemoteComponent
    }

}