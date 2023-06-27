package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DomainModule::class, DataModule::class, ViewModelModel::class])
interface AppComponent {
  fun getViewModel(): ExampleViewModel
  fun inject(activity: MainActivity)

  @Component.Factory
  interface AppComponentFactory {
    fun create(
      @BindsInstance context: Context, @BindsInstance currentTime: Long
    ): AppComponent
  }
}