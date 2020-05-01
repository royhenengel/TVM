package com.example.tvm.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tvm.domain.interactor.movie.MoviesNowPlayingUseCase
import javax.inject.Inject

class MainMoviesFragmentViewModel @Inject constructor(
    private val moviesNowPlayingUseCase: MoviesNowPlayingUseCase
) : ViewModel()
