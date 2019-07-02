package com.erm.composer.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.erm.composer.data.db.dao.base.BaseDao
import com.erm.composer.data.model.entity.Playlist

@Dao
abstract class PlaylistDao : BaseDao<Playlist>() {
    @Query("select * from playlist")
    abstract fun getPlaylists(): List<Playlist>

    @Transaction
    fun getPlaylists(playlistSongJoinDao: PlaylistSongJoinDao): List<Playlist> {
        return getPlaylists().also { playlists ->
            playlists.forEach { playlist ->
                playlist.songs = playlistSongJoinDao.getSongsForPlaylistId(playlist.id)
            }
        }
    }
}