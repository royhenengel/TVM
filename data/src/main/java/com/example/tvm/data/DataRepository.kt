package com.example.tvm.data

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.source.DataStoreFactory
import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.Repository
import com.example.tvm.shared.result.Result
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val dataStoreFactory: DataStoreFactory,
    private val itemMapper: Mapper<ItemEntity, Item>
) : Repository {

    override suspend fun item(): Result<Item> {
        return dataStoreFactory.remote().item().let {result ->
            when (result) {
                is com.example.tvm.shared.result.SingleResult.Result.Success -> {
                    val item = itemMapper.fromEntity(result.data)

                    Result.Success(item)
                }

                is com.example.tvm.shared.result.SingleResult.Result.Error -> { Result.Error(result.exception) }
            }
        }
    }

}