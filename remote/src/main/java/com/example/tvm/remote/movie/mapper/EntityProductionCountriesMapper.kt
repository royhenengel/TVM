package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.ProductionCountriesEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.ProductionCountriesModel

class EntityProductionCountriesMapper: EntityMapper<ProductionCountriesModel, ProductionCountriesEntity> {

    override fun fromRemote(type: ProductionCountriesModel): ProductionCountriesEntity {
        return ProductionCountriesEntity(
            iso31661 = type.iso31661,
            name = type.name
        )
    }

}