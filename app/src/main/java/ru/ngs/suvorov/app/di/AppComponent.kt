package ru.ngs.suvorov.app.di

import dagger.Component
import dagger.android.AndroidInjector
import ru.ngs.suvorov.app.MainApplication
import ru.ngs.suvorov.app.di.scope.AppScope

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<MainApplication>
}