package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DomainModule {
  @Binds
  abstract fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository
}