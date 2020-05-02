package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel

class EntityDatesMapper : EntityMapper<DatesModel, DatesEntity> {

    override fun fromRemote(type: DatesModel): DatesEntity {
        return DatesEntity(
            maximum = type.maximum,
            minimum = type.minimum
        )
    }

}