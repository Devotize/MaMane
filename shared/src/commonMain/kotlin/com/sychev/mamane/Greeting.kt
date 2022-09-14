package com.sychev.mamane

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}