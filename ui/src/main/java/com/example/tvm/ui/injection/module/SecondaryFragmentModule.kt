package com.example.tvm.ui.injection.module

import androidx.lifecycle.ViewModel
import com.example.tvm.ui.injection.FragmentScoped
import com.example.tvm.ui.injection.ViewModelKey
import com.example.tvm.ui.secondary.view.SecondaryFragment
import com.example.tvm.ui.secondary.viewmodel.SecondaryFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class SecondaryFragmentModule {

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun contributeSecondaryFragment(): SecondaryFragment

    @Binds
    @IntoMap
    @ViewModelKey(SecondaryFragmentViewModel::class)
    internal abstract fun bindMainFragmentViewModel(viewModel: SecondaryFragmentViewModel): ViewModel

}