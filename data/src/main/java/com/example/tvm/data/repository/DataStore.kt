package com.example.tvm.data.repository

import com.example.tvm.data.model.BoEntity

interface DataStore {

    @Throws(UnsupportedOperationException::class)
    fun item(): BoEntity

}