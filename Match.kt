package com.example.lolanalisys

import com.google.gson.annotations.SerializedName

class Match {
    @SerializedName("gameId")
    val gameId: Long = 0

    @SerializedName("participantIdentities")
    val participantIdentities: List<ParticipantIdentity>? = null

    @SerializedName("queueId")
    val queueId: Int = 0

    @SerializedName("gameType")
    val gameType: String? = null

    @SerializedName("gameDuration")
    val gameDuration: Long = 0

    @SerializedName("teams")
    val teams: List<TeamStats>? = null

    @SerializedName("platformId")
    val platformId: String? = null

    @SerializedName("gameCreation")
    val gameCreation: Long = 0

    @SerializedName("seasonId")
    val seasonId: Int = 0

    @SerializedName("gameVersion")
    val gameVersion: String? = null

    @SerializedName("mapId")
    val mapId: Int = 0

    @SerializedName("gameMode")
    val gameMode: String? = null

    @SerializedName("participants")
    val participants: List<Participant>? = null

    class ParticipantIdentity{
        //TODO
    }

    class TeamStats{
        //TODO
    }

    class Participant{
        //TODO
    }
}


class MatchSummoner {
    @SerializedName("gameId")
    val gameId: Long = 0

    @SerializedName("role")
    val role : String? = null

    @SerializedName("season")
    val season: Int = 0

    @SerializedName("platformId")
    val platformId: String? = null

    @SerializedName("champion")
    val champion: Int = 0

    @SerializedName("queue")
    val queue: Int = 0

    @SerializedName("lane")
    val lane: String? = null

    @SerializedName("timestamp")
    val timestamp: Long = 0

}