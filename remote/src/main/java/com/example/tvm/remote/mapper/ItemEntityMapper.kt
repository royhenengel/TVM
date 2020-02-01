package com.example.tvm.remote.mapper

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.remote.model.ItemModel
import javax.inject.Inject

class ItemEntityMapper @Inject constructor(): EntityMapper<ItemModel, ItemEntity> {

    override fun fromRemote(type: ItemModel): ItemEntity {
        return ItemEntity(id = type.id)
    }

}