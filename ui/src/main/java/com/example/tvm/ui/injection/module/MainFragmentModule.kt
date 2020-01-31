package com.example.tvm.ui.injection.module

import androidx.lifecycle.ViewModel
import com.example.tvm.ui.injection.FragmentScoped
import com.example.tvm.ui.injection.ViewModelKey
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