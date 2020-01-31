package com.example.tvm.data.injection

import com.example.tvm.data.DataRepository
import com.example.tvm.data.mapper.ItemMapper
import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.ItemEntity
import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindRepository(dataRepository: DataRepository): Repository

    @Binds
    abstract fun bindItemMapper(itemMapper: ItemMapper): Mapper<ItemEntity, Item>
}