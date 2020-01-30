package com.example.tvm.ui.di.module

import com.example.tvm.ui.MainActivity
import com.example.tvm.ui.di.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity
}