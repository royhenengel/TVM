package com.example.tvm.ui.injection.module

import com.example.tvm.ui.MainActivity
import com.example.tvm.ui.injection.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainActivity(): MainActivity

}