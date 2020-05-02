package com.example.tvm.domain.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.domain.interactor.movie.MoviesNowPlayingUseCase
import com.example.tvm.domain.module.DomainModule
import dagger.Component

@Component(
    dependencies = [
        BaseComponent::class,
        DataBridgeComponent::class
    ],
    modules = [DomainModule::class]
)
interface DomainComponent {

    fun provideUseCase(): MoviesNowPlayingUseCase

    @Component.Factory
    interface Factory {

        fun create(
            baseComponent: BaseComponent,
            dataBridgeComponent: DataBridgeComponent
        ): DomainComponent
    }
}