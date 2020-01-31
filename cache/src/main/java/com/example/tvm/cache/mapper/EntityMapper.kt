package com.example.tvm.cache.mapper

interface EntityMapper<C, E> {

    fun fromCached(type: C): E

    fun mapToCached(type: E): C

}