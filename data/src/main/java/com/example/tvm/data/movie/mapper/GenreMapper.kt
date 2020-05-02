package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.GenreEntity
import com.example.tvm.domain.interactor.movie.model.Genre
import javax.inject.Inject

class GenreMapper : Mapper<GenreEntity, Genre> {

    override fun fromEntity(type: GenreEntity): Genre {
        return Genre(
            id = type.id,
            name = type.name
        )
    }

    override fun toEntity(type: Genre): GenreEntity {
        return GenreEntity(
            id = type.id,
            name = type.name
        )
    }

}
