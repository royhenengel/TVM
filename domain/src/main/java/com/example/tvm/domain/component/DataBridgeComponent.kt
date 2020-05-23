package com.example.tvm.domain.component

import com.example.tvm.domain.repository.MoviesRepository


interface DataBridgeComponent {

    fun provideMoviesRepository(): MoviesRepository

}