package com.example.tvm.data.mapper

import com.example.tvm.data.model.BoEntity
import com.example.tvm.domain.model.Bo
import javax.inject.Inject

class BoMapper @Inject constructor(): Mapper<BoEntity, Bo> {

    override fun fromEntity(type: BoEntity): Bo {
        TODO("not implemented")
    }

    override fun toEntity(type: Bo): BoEntity {
        TODO("not implemented")
    }

}