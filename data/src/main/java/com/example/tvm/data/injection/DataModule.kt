package com.example.tvm.data.injection

import com.example.tvm.data.DataMoviesRepository
import com.example.tvm.data.mapper.ItemMapper
import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.ItemEntity
import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.MoviesRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindRepository(dataRepository: DataMoviesRepository): MoviesRepository

    @Binds
    abstract fun bindItemMapper(itemMapper: ItemMapper): Mapper<ItemEntity, Item>

}