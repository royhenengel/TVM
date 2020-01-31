package com.example.tvm.data.injection

import com.example.tvm.data.DataRepository
import com.example.tvm.data.mapper.BoMapper
import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.BoEntity
import com.example.tvm.domain.model.Bo
import com.example.tvm.domain.repository.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindRepository(dataRepository: DataRepository): Repository

    @Binds
    abstract fun bindMapper(boMapper: BoMapper): Mapper<BoEntity, Bo>
}