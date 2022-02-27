package br.com.alura.myapplication

import br.com.alura.myapplication.api.CatJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {

    @GET("/facts/random")
    fun getCatFacts():Call<CatJson>
}