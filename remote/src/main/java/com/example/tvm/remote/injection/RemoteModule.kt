package com.example.tvm.remote.injection

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.Remote
import com.example.tvm.remote.RemoteImpl
import com.example.tvm.remote.mapper.ItemEntityMapper
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.model.ItemModel
import dagger.Binds
import dagger.Module

@Module
abstract class RemoteModule {

    @Binds
    abstract fun bindRemote(remoteImpl: RemoteImpl): Remote

    @Binds
    abstract fun bindEntityMapper(entityMapper: ItemEntityMapper): EntityMapper<ItemModel, ItemEntity>

}