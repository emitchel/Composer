package com.erm.composer.data.model.entity

import androidx.room.Entity
import androidx.room.ForeignKey


@Entity(
    tableName = "song_play_join",
    primaryKeys = ["songId", "playlistId"], foreignKeys = [
        ForeignKey(
            entity = Song::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("songId")
        ),
        ForeignKey(
            entity = Playlist::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("playlistId")
        )
    ]
)
class PlaylistSongJoin(val songId: Int, val playlistId: Int)