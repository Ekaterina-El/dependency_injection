package com.example.dependencyinjectionstart.example1

class Component {

  private fun getComputer(): Computer {
    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val computerTower = ComputerTower(
      Storage(),
      Memory(),
      Processor()
    )
    val computer = Computer(monitor, computerTower, keyboard, mouse)
    return computer
  }

  fun inject(activity: Activity) {
  }
}