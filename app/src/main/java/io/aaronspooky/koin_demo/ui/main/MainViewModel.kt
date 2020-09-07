package io.aaronspooky.koin_demo.ui.main

import androidx.lifecycle.ViewModel
import io.aaronspooky.koin_demo.interfaces.HelloRepository
import io.aaronspooky.koin_demo.interfaces.shared_preferences.SharedPreferencesRepository

class MainViewModel(
    private val helloRepository: HelloRepository,
    private val sharedPreferencesRepository: SharedPreferencesRepository
) : ViewModel() {

    fun hello() {
        helloRepository.hello()
    }

    fun addOperation(a: Int, b: Int) {
        val add: (Int, Int) -> Int = { x, y ->
            x + y
        }

        val div: (Int, Int) -> Int = { x, y ->
            x / y
        }

        helloRepository.math(a, b, add)
        helloRepository.math(a, b, div)
    }

    fun showPackageName() {
        sharedPreferencesRepository.contextLog()
    }
}