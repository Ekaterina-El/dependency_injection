package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject
  lateinit var viewModelFactory: ViewModelFactory
  private val viewModel: ExampleViewModel by lazy {
    ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
  }

  private val component by lazy { (application as MyApplication).component }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    component.inject(this)

    Log.d("EXAMPLE_TEST", viewModel.toString())
    viewModel.method()
  }
}