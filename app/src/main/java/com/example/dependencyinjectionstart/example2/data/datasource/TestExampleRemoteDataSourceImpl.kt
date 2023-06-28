package com.example.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class TestExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
        Log.d("ExampleRemoteDataSource", "Test")
    }
}
