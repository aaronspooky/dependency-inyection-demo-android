package io.aaronspooky.koin_demo

import android.app.Application
import io.aaronspooky.koin_demo.koin.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class DemoApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@DemoApplication)
            modules(appModule)
        }
    }
}