package ru.ngs.suvorov.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ru.ngs.suvorov.app.di.DaggerAppComponent

class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent
            .factory()
            .create(this)
}