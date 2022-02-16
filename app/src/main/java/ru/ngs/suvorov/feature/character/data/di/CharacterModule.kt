package ru.ngs.suvorov.feature.character.data.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import ru.ngs.suvorov.feature.character.data.network.CharacterApi

@Module
interface CharacterDataModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        @Reusable
        fun provideCharacterApi(retrofit: Retrofit): CharacterApi =
            retrofit.create(CharacterApi::class.java)
    }
}