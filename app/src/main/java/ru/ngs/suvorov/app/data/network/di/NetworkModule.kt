package ru.ngs.suvorov.app.data.network.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.ngs.suvorov.app.di.scope.AppScope

@Module
class NetworkModule {

    private companion object {

        const val url = "https://rickandmortyapi.com/"
    }

    @Provides
    @AppScope
    fun provideGson(): Gson =
        GsonBuilder().create()

    @Provides
    @AppScope
    fun provideRetrofit(gson: Gson): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(url)
            .build()
}