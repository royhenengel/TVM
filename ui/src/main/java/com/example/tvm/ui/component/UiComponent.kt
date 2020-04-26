package com.example.tvm.ui.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.domain.component.DomainComponent
import com.example.tvm.ui.main.view.MainMoviesFragment
import com.example.tvm.ui.module.UiMoviesModule
import com.example.tvm.ui.module.ViewModelModule
import dagger.Component

@Component(
    dependencies = [
        BaseComponent::class,
        DomainComponent::class
    ],
    modules = [
        ViewModelModule::class,
        UiMoviesModule::class
    ]
)
interface UiComponent {

    fun inject(mainMoviesFragment: MainMoviesFragment)

    @Component.Factory
    interface Factory {

        fun create(baseComponent: BaseComponent, domainComponent: DomainComponent): UiComponent
    }
}