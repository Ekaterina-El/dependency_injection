package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface AppComponent {
  fun inject(activity: MainActivity)

  @Component.Factory
  interface AppComponentFactory {
    fun create(
      @BindsInstance context: Context,
      @BindsInstance  currentTime: Long
    ): AppComponent
  }
}