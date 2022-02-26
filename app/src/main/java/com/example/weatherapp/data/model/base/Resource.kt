package com.example.weatherapp.data.model.base

import okhttp3.ResponseBody

sealed class Resource<out T> {
    data class Success<out T>(val data : T): Resource<T>()

    data class Failure(
        val isServerError: Boolean,
        val code: Int?,
        val error: ResponseBody?
    ): Resource<Nothing>()
}