package com.example.project_eventvox

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EventSearch(
    val imgEvent: Int,
    val titleEvent: String,
    val locEvent: String,
    val dateEvent: String,
    val idrEvent: String
) : Parcelable