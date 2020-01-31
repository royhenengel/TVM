package com.example.tvm.data.mapper

interface Mapper<E, B> {

    fun fromEntity(type: E): B

    fun toEntity(type: B): E

}