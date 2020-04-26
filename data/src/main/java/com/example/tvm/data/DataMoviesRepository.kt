package com.example.tvm.data

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.source.DataStoreFactory
import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.MoviesRepository
import com.example.tvm.base.result.Result
import javax.inject.Inject

class DataMoviesRepository @Inject constructor(
    private val dataStoreFactory: DataStoreFactory,
    private val itemMapper: Mapper<ItemEntity, Item>
) : MoviesRepository {

    override suspend fun item(): Result<Item> {
        return dataStoreFactory.remoteDataStore().item().let { result ->
            when (result) {
                is Result.Success -> {
                    val item = itemMapper.fromEntity(result.data)

                    Result.Success(item)
                }

                is Result.Error -> { Result.Error(result.exception) }
            }
        }
    }

}