package com.example.tvm.data

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.source.DataStoreFactory
import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.Repository
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val dataStoreFactory: DataStoreFactory,
    private val mapper: Mapper<ItemEntity, Item>
) : Repository {

    override fun item(): Item {
        return dataStoreFactory.remote().item().let {
            mapper.fromEntity(it)
        }
    }

}