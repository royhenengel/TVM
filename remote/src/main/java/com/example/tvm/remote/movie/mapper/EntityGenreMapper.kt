package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.GenreEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.GenreModel

class EntityGenreMapper : EntityMapper<GenreModel, GenreEntity> {

    override fun fromRemote(type: GenreModel): GenreEntity {
        return GenreEntity(
            id = type.id,
            name = type.name
        )
    }

}
