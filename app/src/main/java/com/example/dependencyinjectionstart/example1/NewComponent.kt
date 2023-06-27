package com.example.dependencyinjectionstart.example1

@dagger.Component(modules = [ComputerModule::class])
interface NewComponent {
  fun inject(activity: Activity)
}