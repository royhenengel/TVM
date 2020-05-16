package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.ProductionCompanyEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.ProductionCompanyModel

class EntityProductionCompanyMapper: EntityMapper<ProductionCompanyModel, ProductionCompanyEntity> {

    override fun fromRemote(type: ProductionCompanyModel): ProductionCompanyEntity {
        return ProductionCompanyEntity(
            logoPath = type.logoPath,
            name = type.name,
            id = type.id,
            originCountry = type.originCountry
        )
    }

}