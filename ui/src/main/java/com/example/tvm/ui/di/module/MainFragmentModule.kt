package com.example.tvm.ui.di.module

import androidx.lifecycle.ViewModel
import com.example.tvm.ui.di.FragmentScoped
import com.example.tvm.ui.di.ViewModelKey
import com.example.tvm.ui.main.view.MainFragment
import com.example.tvm.ui.main.viewmodel.MainFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class MainFragmentModule {

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun contributeMainFragment(): MainFragment

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    internal abstract fun bindMainFragmentViewModel(viewModel: MainFragmentViewModel): ViewModel

}