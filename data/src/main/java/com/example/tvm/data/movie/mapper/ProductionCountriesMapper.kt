package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.ProductionCountriesEntity
import com.example.tvm.domain.interactor.movie.model.ProductionCountries

class ProductionCountriesMapper: Mapper<ProductionCountriesEntity, ProductionCountries> {

    override fun fromEntity(type: ProductionCountriesEntity): ProductionCountries {
        return ProductionCountries(
            iso31661 = type.iso31661,
            name = type.name
        )
    }

    override fun toEntity(type: ProductionCountries): ProductionCountriesEntity {
        return ProductionCountriesEntity(
            iso31661 = type.iso31661,
            name = type.name
        )
    }

}