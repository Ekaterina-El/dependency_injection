package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject
  lateinit var viewModel: ExampleViewModel

  private val component by lazy { (application as MyApplication).component }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    component.inject(this)

    Log.d("EXAMPLE_TEST", viewModel.toString())
    viewModel.method()
  }
}