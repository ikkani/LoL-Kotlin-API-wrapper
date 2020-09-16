package com.example.lolanalisys

import com.google.gson.annotations.SerializedName
import java.util.*

class Summoner{

    @SerializedName(value = "accountId")
    var accountId: String? = null

    @SerializedName(value = "profileIconId")
    var profileIconId: Int = -1

    @SerializedName(value = "revisionDate")
    var revisionDate: String? = null

    @SerializedName(value = "name")
    var name: String? = null

    @SerializedName(value = "id")
    var id: String = ""

    @SerializedName(value = "puuid")
    var puuid: String? = null

    @SerializedName(value = "summonerLevel")
    var summonerLevel: Long = -1


    fun fillBasicData(s: Summoner) : Unit{
        this.accountId = s._accountId()
        this.profileIconId = s._profileIconId()
        this.revisionDate = s._revisionDate()
        this.name = s._name()
        this.id = s._id()
        this.puuid = s._puuid()
        this.summonerLevel = s._summonerLevel()
    }

    fun returnBasicData(): String{
        return (
                "Id de la cuenta: " + accountId + "\n" +
                "Nombre de la cuenta: " + name + "\n" +
                "Nivel de invocador: " + summonerLevel + "\n"
                )
    }

    fun _accountId():String? {return accountId}
    fun _profileIconId():Int {return profileIconId}
    fun _revisionDate():String? {return revisionDate}
    fun _name():String? {return name}
    fun _id():String {return id}
    fun _puuid():String? {return puuid}
    fun _summonerLevel():Long {return summonerLevel}

    class League{
        @SerializedName(value = "wins")
        var wins: Int = 0

        @SerializedName(value = "losses")
        var losses: Int = 0

        @SerializedName(value = "leaguepoints")
        var leaguepoints: Int = 0

    }

    var wins: Int = 0
    var losses: Int = 0
    var leaguepoints: Int = 0
    var winratio:Float = 0.0f

    fun fillStats(l: League): Unit{
        this.wins = l.wins
        this.losses = l.losses
        this.leaguepoints = l.leaguepoints
        this.winratio = (wins/(losses+wins.toFloat()))*100
    }

    fun _wins():Int {return wins}
    fun _losses():Int {return losses}
    fun _leaguepoints():Int {return leaguepoints}
    fun _winratio():Float {return winratio}



}
/*

}*/

