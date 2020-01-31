package com.example.tvm.domain.repository

import com.example.tvm.domain.model.Item

interface Repository {

    fun item(): Item
}