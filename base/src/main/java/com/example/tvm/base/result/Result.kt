package com.example.tvm.base.result

import com.example.tvm.base.result.Result.Success

sealed class Result<out R> {

    data class Success<out T>(val data: T) : Result<T>()

    data class Error(val exception: Exception) : Result<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}

val Result<*>.succeeded
    get() = this is Success && data != null

fun <T> Result<T>.successOr(fallback: T): T {
    return (this as? Success<T>)?.data ?: fallback
}
