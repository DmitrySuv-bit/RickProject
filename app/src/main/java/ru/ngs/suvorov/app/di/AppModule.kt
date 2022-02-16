package ru.ngs.suvorov.app.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule
import ru.ngs.suvorov.app.MainApplication
import ru.ngs.suvorov.app.data.network.di.NetworkModule
import ru.ngs.suvorov.app.di.scope.AppScope

@Module(
    includes = [
        AndroidInjectionModule::class,
        DataModule::class,

        NetworkModule::class,

        ActivityModule::class
    ]
)
interface AppModule {

    @Binds
    @AppScope
    fun bindContext(app: MainApplication): Context

    @Binds
    @AppScope
    fun bindApplication(app: MainApplication): Application
}