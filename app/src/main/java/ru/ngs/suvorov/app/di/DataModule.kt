package ru.ngs.suvorov.app.di

import dagger.Module
import ru.ngs.suvorov.feature.character.data.di.CharacterDataModule

@Module(includes = [
    CharacterDataModule::class
])
interface DataModule