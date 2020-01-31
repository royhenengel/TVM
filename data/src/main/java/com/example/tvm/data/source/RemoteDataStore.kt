package com.example.tvm.data.source

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.DataStore
import com.example.tvm.data.repository.Remote
import javax.inject.Inject

class RemoteDataStore @Inject constructor(
    private val remote: Remote
) : DataStore {

    override fun item(): ItemEntity {
        throw UnsupportedOperationException()
    }

}