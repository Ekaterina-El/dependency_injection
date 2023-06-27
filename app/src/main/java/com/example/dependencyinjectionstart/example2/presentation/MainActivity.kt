package com.example.dependencyinjectionstart.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
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

  private val component by lazy {
    (application as MyApplication).component
      .activityComponentFactory().create("ACTIVITY_ID-1", "My-name-1")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    component.inject(this)
    viewModel.method()

    findViewById<TextView>(R.id.textview).setOnClickListener {
      startActivity(Intent(this, MainActivity2::class.java))
    }
  }
}