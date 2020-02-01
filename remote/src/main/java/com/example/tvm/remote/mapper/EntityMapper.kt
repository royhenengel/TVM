package com.example.tvm.remote.mapper

interface EntityMapper<in M, out E> {

    fun fromRemote(type: M): E

}