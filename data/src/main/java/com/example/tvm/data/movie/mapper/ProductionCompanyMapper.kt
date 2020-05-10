package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.ProductionCompanyEntity
import com.example.tvm.domain.interactor.movie.model.ProductionCompany

class ProductionCompanyMapper : Mapper<ProductionCompanyEntity, ProductionCompany> {

    override fun fromEntity(type: ProductionCompanyEntity): ProductionCompany {
        return ProductionCompany(
            logoPath = type.logoPath,
            name = type.name,
            id = type.id,
            originCountry = type.originCountry
        )
    }

    override fun toEntity(type: ProductionCompany): ProductionCompanyEntity {
        return ProductionCompanyEntity(
            logoPath = type.logoPath,
            name = type.name,
            id = type.id,
            originCountry = type.originCountry
        )
    }

}