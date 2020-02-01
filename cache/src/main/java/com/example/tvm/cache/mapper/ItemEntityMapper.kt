package com.example.tvm.cache.mapper

import com.example.tvm.cache.model.ItemModel

import com.example.tvm.data.model.ItemEntity
import javax.inject.Inject

class ItemEntityMapper @Inject constructor() : EntityMapper<ItemModel, ItemEntity> {

    override fun fromCached(type: ItemModel): ItemEntity {
        return ItemEntity(id = type.id)
    }

    override fun toCached(type: ItemEntity): ItemModel {
        return ItemModel(id = type.id)
    }

}