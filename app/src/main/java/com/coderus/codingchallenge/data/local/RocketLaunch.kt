package com.coderus.codingchallenge.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

/**
 * Model object to store data about a rocket launch.
 */
@Entity(tableName = "rocket_launch")
@JsonClass(generateAdapter = true)
data class RocketLaunch(
    @PrimaryKey
    @Json(name = "flight_number")
    val flightNumber: Int,
    @Json(name = "name")
    val name: String,
    @Json(name = "date_utc")
    val dateUTC: String,
    @Json(name = "details")
    val details: String?,
    @Json(name = "success")
    val success: Boolean?
): Serializable
