package com.example.tvm.shared.result

import com.example.tvm.shared.result.SingleResult.Success

sealed class SingleResult<out R> {

    data class Success<out T>(val data: T) : SingleResult<T>()

    data class Error(val exception: Exception) : SingleResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}

sealed class ObservableResult<out R> {

    data class Success<out T>(val data: T) : ObservableResult<T>()

    data class Error(val exception: Exception) : ObservableResult<Nothing>()

    object Loading : ObservableResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
            Loading -> "Loading"
        }
    }
}

val SingleResult<*>.succeeded
    get() = this is Success && data != null

val ObservableResult<*>.succeeded
    get() = this is ObservableResult.Success && data != null

fun <T> SingleResult<T>.successOr(fallback: T): T {
    return (this as? Success<T>)?.data ?: fallback
}

fun <T> ObservableResult<T>.successOr(fallback: T): T {
    return (this as? ObservableResult.Success<T>)?.data ?: fallback
}
