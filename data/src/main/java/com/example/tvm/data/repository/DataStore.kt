package com.example.tvm.data.repository

import com.example.tvm.data.model.ItemEntity

interface DataStore {

    @Throws(UnsupportedOperationException::class)
    fun item(): ItemEntity

}