package com.example.tvm.data

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.source.DataStoreFactory
import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.Repository
import com.example.tvm.shared.result.SingleResult
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val dataStoreFactory: DataStoreFactory,
    private val itemMapper: Mapper<ItemEntity, Item>
) : Repository {

    override suspend fun item(): SingleResult<Item> {
        return dataStoreFactory.remote().item().let {result ->
            when (result) {
                is SingleResult.Success -> {
                    val item = itemMapper.fromEntity(result.data)

                    SingleResult.Success(item)
                }

                is SingleResult.Error -> { SingleResult.Error(result.exception) }
            }
        }
    }

}