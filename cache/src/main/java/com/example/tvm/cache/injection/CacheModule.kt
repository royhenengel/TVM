package com.example.tvm.cache.injection

import com.example.tvm.cache.CacheImpl
import com.example.tvm.data.repository.Cache
import dagger.Binds
import dagger.Module

@Module
abstract class CacheModule {

    @Binds
    abstract fun bindCache(cacheImpl: CacheImpl): Cache

}