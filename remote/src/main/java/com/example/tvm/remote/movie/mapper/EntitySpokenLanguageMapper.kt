package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.SpokenLanguagesEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.SpokenLanguagesModel

class EntitySpokenLanguageMapper : EntityMapper<SpokenLanguagesModel, SpokenLanguagesEntity> {

    override fun fromRemote(type: SpokenLanguagesModel): SpokenLanguagesEntity {
        return SpokenLanguagesEntity(
            name = type.name,
            iso6391 = type.iso6391
        )
    }

}