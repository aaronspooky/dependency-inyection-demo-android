package io.aaronspooky.koin_demo.koin

import io.aaronspooky.koin_demo.interfaces.HelloRepository
import io.aaronspooky.koin_demo.interfaces.HelloRepositoryImpl
import io.aaronspooky.koin_demo.interfaces.shared_preferences.SharedPreferencesRepository
import io.aaronspooky.koin_demo.interfaces.shared_preferences.SharedPreferencesRepositoryImpl
import io.aaronspooky.koin_demo.ui.main.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    /**
     * Expose 'interface'. Interface implementation is not shared.
     */
    single<HelloRepository> { HelloRepositoryImpl() }

    /**
     * Expose 'interface'. Interface contains [androidApplication] in constructor.
     */
    factory<SharedPreferencesRepository> { SharedPreferencesRepositoryImpl(
        application = androidApplication()
    )
    }

    viewModel { MainViewModel(
        helloRepository = get(),
        sharedPreferencesRepository = get()
    )
    }

}