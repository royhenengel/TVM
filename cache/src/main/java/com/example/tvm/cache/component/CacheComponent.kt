package com.example.tvm.cache.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.cache.module.CacheModule
import dagger.Component

@Component(
    dependencies = [BaseComponent::class],
    modules = [CacheModule::class]
)
interface CacheComponent {

    @Component.Factory
    interface Factory {

        fun create(baseComponent: BaseComponent): CacheComponent
    }

}