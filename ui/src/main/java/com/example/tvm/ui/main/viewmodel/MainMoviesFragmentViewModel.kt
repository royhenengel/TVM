package com.example.tvm.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tvm.domain.interactor.movie.AllMoviesUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainMoviesFragmentViewModel @Inject constructor(
    private val allMoviesUseCase: AllMoviesUseCase
) : ViewModel() {

    init {
        allMovies()
    }

    private fun allMovies() {
        viewModelScope.launch {
            allMoviesUseCase.allMovies()
        }
    }
}
