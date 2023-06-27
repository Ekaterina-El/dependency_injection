package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DomainModule::class, DataModule::class])
interface AppComponent {
  fun activityComponentFactory(): ActivityComponent.Factory

  @Component.Factory
  interface AppComponentFactory {
    fun create(
      @BindsInstance context: Context, @BindsInstance currentTime: Long
    ): AppComponent
  }
}