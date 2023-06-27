package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [ContextModule::class, DomainModule::class, DataModule::class])
interface AppComponent {
  fun inject(activity: MainActivity)
}