package io.aaronspooky.koin_demo.interfaces

interface HelloRepository {

    fun hello()
    fun math(a: Int, b: Int, operation: (Int, Int) -> Int)
}