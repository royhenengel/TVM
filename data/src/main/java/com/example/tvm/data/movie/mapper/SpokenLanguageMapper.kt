package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.SpokenLanguagesEntity
import com.example.tvm.domain.interactor.movie.model.SpokenLanguages

class SpokenLanguageMapper : Mapper<SpokenLanguagesEntity, SpokenLanguages> {

    override fun fromEntity(type: SpokenLanguagesEntity): SpokenLanguages {
        return SpokenLanguages(
            name = type.name,
            iso6391 = type.iso6391
        )
    }

    override fun toEntity(type: SpokenLanguages): SpokenLanguagesEntity {
        return SpokenLanguagesEntity(
            name = type.name,
            iso6391 = type.iso6391
        )
    }

}