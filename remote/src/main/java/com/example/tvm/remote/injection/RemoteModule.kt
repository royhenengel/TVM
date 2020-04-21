package com.example.tvm.remote.injection

import com.example.tvm.data.repository.Remote
import com.example.tvm.remote.RemoteImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RemoteModule {

    @Binds
    abstract fun bindRemote(remoteImpl: RemoteImpl): Remote

}