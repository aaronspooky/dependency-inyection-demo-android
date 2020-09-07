package io.aaronspooky.koin_demo.interfaces.shared_preferences

import android.app.Application
import android.util.Log

class SharedPreferencesRepositoryImpl(
    private val application: Application
): SharedPreferencesRepository {

    private val tag = "SharedPreferencesRepositoryImpl"

    override fun contextLog() {
        Log.i(tag, application.packageName)
    }
}