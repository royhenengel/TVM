package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.domain.interactor.movie.model.Dates
import javax.inject.Inject

class DatesMapper @Inject constructor() : Mapper<DatesEntity, Dates> {

    override fun fromEntity(type: DatesEntity): Dates {
        return Dates(
            maximum = type.maximum,
            minimum = type.minimum
        )
    }

    override fun toEntity(type: Dates): DatesEntity {
        return DatesEntity(
            maximum = type.maximum,
            minimum = type.minimum
        )
    }

}