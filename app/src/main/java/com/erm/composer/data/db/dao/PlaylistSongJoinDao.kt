package com.erm.composer.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.erm.composer.data.model.entity.Playlist
import com.erm.composer.data.model.entity.PlaylistSongJoin
import com.erm.composer.data.model.entity.Song

@Dao
abstract class PlaylistSongJoinDao {
    @Insert
    abstract fun insert(userRepoJoin: PlaylistSongJoin)

    @Query(
        "SELECT * FROM song INNER JOIN song_play_join ON song.id=song_play_join.songId WHERE song_play_join.playlistId=:playlistId"
    )
    abstract fun getSongsForPlaylistId(playlistId: Int): List<Song>

    @Query(
        "SELECT * FROM playlist INNER JOIN song_play_join ON playlist.id=song_play_join.playlistId WHERE song_play_join.songId=:songId"
    )
    abstract fun getPlaylistsForSongId(songId: Int): List<Playlist>

}