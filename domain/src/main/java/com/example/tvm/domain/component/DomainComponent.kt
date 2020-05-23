package com.example.tvm.domain.component

import com.example.tvm.base.component.BaseComponent
import com.example.tvm.domain.interactor.movie.*
import com.example.tvm.domain.module.DomainModule
import dagger.Component

@Component(
    dependencies = [
        BaseComponent::class,
        DataBridgeComponent::class
    ],
    modules = [
        DomainModule::class
    ]
)
interface DomainComponent {

    fun provideMoviesLatestUseCase(): MoviesLatestUseCase

    fun provideMoviesNowPlayingUseCase(): MoviesNowPlayingUseCase

    fun provideMoviesPopularUseCase(): MoviesPopularUseCase

    fun provideMoviesTopRatedUseCase(): MoviesTopRatedUseCase

    fun provideMoviesUpcomingUseCase(): MoviesUpcomingUseCase

    fun provideAllMoviesUseCase(): AllMoviesUseCase

    @Component.Factory
    interface Factory {

        fun create(
            baseComponent: BaseComponent,
            dataBridgeComponent: DataBridgeComponent
        ): DomainComponent
    }
}