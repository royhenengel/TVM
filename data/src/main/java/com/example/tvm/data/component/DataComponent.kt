package com.example.tvm.data.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.data.module.DataModule
import com.example.tvm.domain.component.DataBridgeComponent
import com.example.tvm.domain.component.DomainComponent
import dagger.Component

@Component(
    dependencies = [
        BaseComponent::class,
        RemoteBridgeComponent::class,
        CacheBridgeComponent::class
    ],
    modules = [DataModule::class]
)
interface DataComponent: DataBridgeComponent {

    @Component.Factory
    interface Factory {

        fun create(
            baseComponent: BaseComponent,
            remoteBridgeComponent: RemoteBridgeComponent,
            cacheBridgeComponent: CacheBridgeComponent
        ): DataComponent
    }

}