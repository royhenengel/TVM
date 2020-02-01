package com.example.tvm.cache.injection

import com.example.tvm.cache.CacheImpl
import com.example.tvm.cache.mapper.ItemEntityMapper
import com.example.tvm.cache.mapper.EntityMapper
import com.example.tvm.cache.model.ItemModel
import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.Cache
import dagger.Binds
import dagger.Module

@Module
abstract class CacheModule {

    @Binds
    abstract fun bindCache(cacheImpl: CacheImpl): Cache

    @Binds
    abstract fun bindEntityMapper(itemEntityMapper: ItemEntityMapper): EntityMapper<ItemModel, ItemEntity>

}