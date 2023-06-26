package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
   val component = DaggerNewComponent.create()
   val keyboardGetter: Keyboard = component.getKeyboard()
   val mouseGetter: Mouse = component.getMouse()
   val monitorGetter: Monitor = component.getMonitor()

   @Inject
   lateinit var keyboard: Keyboard

   @Inject
   lateinit var mouse: Monitor

   @Inject
   lateinit var monitor: Monitor
   init {
      DaggerNewComponent.create().inject(this)
   }

}