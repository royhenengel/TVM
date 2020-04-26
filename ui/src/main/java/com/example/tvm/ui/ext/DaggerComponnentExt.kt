package com.example.tvm.ui.ext

import androidx.fragment.app.Fragment
import com.example.tvm.base.component.BaseComponent
import com.example.tvm.base.ext.baseComponent
import com.example.tvm.cache.component.DaggerCacheComponent
import com.example.tvm.data.component.DaggerDataComponent
import com.example.tvm.domain.component.DaggerDomainComponent
import com.example.tvm.remote.component.DaggerRemoteComponent
import com.example.tvm.ui.component.DaggerUiComponent
import com.example.tvm.ui.component.UiComponent

fun uiDaggerComponent(fragment: Fragment): UiComponent = daggerComponent(fragment.baseComponent())

private fun daggerComponent(baseComponent: BaseComponent): UiComponent {
    val remoteComponent = DaggerRemoteComponent.factory().create(baseComponent = baseComponent)

    val cacheComponent = DaggerCacheComponent.factory().create(baseComponent = baseComponent)

    val dataComponent = DaggerDataComponent.factory().create(
        baseComponent = baseComponent,
        remoteBridgeComponent = remoteComponent,
        cacheBridgeComponent = cacheComponent
    )

    val domainComponent = DaggerDomainComponent.factory().create(
        baseComponent = baseComponent,
        dataBridgeComponent = dataComponent
    )

    return DaggerUiComponent.factory().create(
        baseComponent = baseComponent,
        domainComponent = domainComponent
    )
}
