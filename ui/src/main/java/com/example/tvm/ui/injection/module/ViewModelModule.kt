package com.example.tvm.ui.injection.module

import androidx.lifecycle.ViewModelProvider
import com.example.tvm.ui.injection.TvmViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: TvmViewModelFactory): ViewModelProvider.Factory
}