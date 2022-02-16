package ru.ngs.suvorov.feature.character.data.network

import retrofit2.http.GET
import retrofit2.http.Query
import ru.ngs.suvorov.feature.character.data.network.model.Characters

interface CharacterApi {

    @GET("api/character/")
    suspend fun getCharacter(@Query("page") page: Int): Characters
}