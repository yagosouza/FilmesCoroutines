package com.yagosouza.filmescoroutines

import android.app.Application
import com.yagosouza.filmescoroutines.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApp)

            modules(
                mainModule
            )
        }
    }
}