package com.example.weatherapp.data.repository.base

import com.example.weatherapp.data.model.base.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.lang.Exception

abstract class BaseRepository {

    protected suspend fun <T> apiCall(
        apiCall: suspend () -> T
    ): Resource<T>? {
        return withContext(Dispatchers.IO) {
            try {
                Resource.Success(apiCall.invoke())
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
                when(throwable) {
                    is HttpException -> {
                        Resource.Failure(
                            true, throwable.code(), throwable.response()?.errorBody()
                        )
                    }

                    else -> {
                        Resource.Failure(false, null, null)
                    }
                }

            }
        }
    }

}