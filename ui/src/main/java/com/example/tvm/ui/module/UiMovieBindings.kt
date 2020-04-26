package com.example.tvm.ui.module

import androidx.lifecycle.ViewModel
import com.example.tvm.shared.module.ViewModelKey
import com.example.tvm.ui.main.viewmodel.MainMoviesFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class UiMovieBindings {

    @Binds
    @IntoMap
    @ViewModelKey(MainMoviesFragmentViewModel::class)
    internal abstract fun bindMainFragmentViewModel(viewModelMovies: MainMoviesFragmentViewModel): ViewModel

}
