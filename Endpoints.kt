package com.example.lolanalisys

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface Endpoints {

    @GET("/lol/platform/v3/champion-rotations")
    fun get(@Query("api_key") key: String): Call<Summoner>

    @GET("/lol/summoner/v4/summoners/by-name/{summonerName}")
    fun getBasicData(@Path("summonerName") summonerName: String, @Query("api_key") key: String): Call<Summoner>

    @GET("/lol/league/v4/entries/by-summoner/{encryptedSummonerId}")
    fun getSummonerGamesData(@Path("encryptedSummonerId") encryptedSummonerId: String, @Query("api_key") key: String): Call<List<Summoner.League>>

    @GET("/lol/match/v4/matchlists/by-account/{encryptedAccountId}")
    fun getSummonerMatchlist(@Path("encryptedAccountId") encryptedAccountId: String, @Query("api_key") key: String): Call<List<MatchSummoner>>

    @GET("/lol/match/v4/matches/{matchId}")
    fun getMatch(@Path("matchId") matchId: Long, @Query("api_key") key: String): Call<Match>
}