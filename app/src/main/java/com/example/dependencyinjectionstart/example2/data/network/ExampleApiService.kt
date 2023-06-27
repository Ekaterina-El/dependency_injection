package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import com.example.dependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleApiService @Inject constructor() {

  fun method() {
    Log.d(LOG_TAG, "ExampleApiService")
  }

  companion object {
    private const val LOG_TAG = "EXAMPLE_TEST"
  }
}
