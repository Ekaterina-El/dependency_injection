package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
  @ApplicationScope
  @Binds
  fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

  @ApplicationScope
  @RemoteDataSource
  @Binds
  fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

  @ApplicationScope
  @TestRemoteDataSource
  @Binds
  fun provideTestRemoteDataSource(impl: TestExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}