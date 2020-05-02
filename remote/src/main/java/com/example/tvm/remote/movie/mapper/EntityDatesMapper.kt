package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import javax.inject.Inject

class EntityDatesMapper @Inject constructor() : EntityMapper<DatesModel, DatesEntity> {

    override fun fromRemote(type: DatesModel): DatesEntity {
        return DatesEntity(
            maximum = type.maximum,
            minimum = type.minimum
        )
    }

}