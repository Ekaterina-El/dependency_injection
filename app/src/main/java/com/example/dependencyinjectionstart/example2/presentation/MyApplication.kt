package com.example.dependencyinjectionstart.example2.presentation

import android.app.Application
import com.example.dependencyinjectionstart.example2.di.DaggerAppComponent

class MyApplication: Application() {
  val component by lazy {
    DaggerAppComponent.factory().create(this, System.currentTimeMillis())
  }
}