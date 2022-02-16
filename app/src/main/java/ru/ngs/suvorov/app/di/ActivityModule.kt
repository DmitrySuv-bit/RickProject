package ru.ngs.suvorov.app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ngs.suvorov.app.MainActivity

@Module
interface ActivityModule {

    @ContributesAndroidInjector()
    fun mainActivityInjector(): MainActivity
}