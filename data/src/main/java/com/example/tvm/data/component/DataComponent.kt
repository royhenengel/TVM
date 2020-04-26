package com.example.tvm.data.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.data.module.DataMoviesModule
import com.example.tvm.domain.component.DomainComponent
import dagger.Component

@Component(
    dependencies = [
        BaseComponent::class,
        RemoteBridgeComponent::class,
        CacheBridgeComponent::class
    ],
    modules = [DataMoviesModule::class]
)
interface DataComponent {


    @Component.Factory
    interface Factory {

        fun create(
            baseComponent: BaseComponent,
            remoteBridgeComponent: RemoteBridgeComponent,
            cacheBridgeComponent: CacheBridgeComponent
        ): DomainComponent
    }

}