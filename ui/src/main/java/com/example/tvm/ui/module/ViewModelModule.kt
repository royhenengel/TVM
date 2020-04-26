package com.example.tvm.ui.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tvm.ui.main.viewmodel.MainMoviesFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    // TODO Move factory to base
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactoryImpl): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainMoviesFragmentViewModel::class)
    internal abstract fun bindMainFragmentViewModel(viewModelMovies: MainMoviesFragmentViewModel): ViewModel

}
