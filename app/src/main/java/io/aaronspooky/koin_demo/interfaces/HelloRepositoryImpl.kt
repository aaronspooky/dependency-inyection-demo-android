package io.aaronspooky.koin_demo.interfaces

import android.util.Log

class HelloRepositoryImpl: HelloRepository {

    private val tag = "HelloRepository"

    override fun hello() {
        Log.i(tag, "Hello World!")
    }

    override fun math(a: Int, b: Int, operation: (Int, Int) -> Int) {
        val result = operation(a, b)
        Log.i(tag, result.toString())
    }
}