package com.example.tvm.app.component

import com.example.tvm.app.TvmApplication
import com.example.tvm.app.module.AppModule
import com.example.tvm.base.component.BaseComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [BaseComponent::class],
    modules = [AppModule::class]
)
interface AppComponent  {

    fun inject(application: TvmApplication)

    @Component.Factory
    interface Factory {

        fun create(baseComponent: BaseComponent): AppComponent
    }

}