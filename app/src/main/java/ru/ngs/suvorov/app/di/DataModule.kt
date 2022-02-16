package ru.ngs.suvorov.app.di

import dagger.Module
import ru.ngs.suvorov.feature.character.di.CharacterDataModule

@Module(
    includes = [
        CharacterDataModule::class
    ]
)
interface DataModule