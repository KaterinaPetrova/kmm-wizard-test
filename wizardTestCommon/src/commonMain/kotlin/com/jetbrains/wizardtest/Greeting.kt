package com.jetbrains.wizardtest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}