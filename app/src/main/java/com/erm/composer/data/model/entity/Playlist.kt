package com.erm.composer.data.model.entity

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import org.threeten.bp.LocalDateTime

@Entity
class Playlist(
    var title: String,
    var created: LocalDateTime
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    @Ignore //many to many, filling this in at dao layer
    var songs: List<Song>? = null
}