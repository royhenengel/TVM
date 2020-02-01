package com.example.tvm.data.mapper

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.domain.model.Item
import javax.inject.Inject

class ItemMapper @Inject constructor(): Mapper<ItemEntity, Item> {

    override fun fromEntity(type: ItemEntity): Item {
        return Item(id = type.id)
    }

    override fun toEntity(type: Item): ItemEntity {
        return ItemEntity(id = type.id)
    }

}