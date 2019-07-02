package com.erm.composer.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.erm.composer.data.db.converters.Converters
import com.erm.composer.data.db.dao.PlaylistDao
import com.erm.composer.data.db.dao.PlaylistSongJoinDao
import com.erm.composer.data.db.dao.SongDao
import com.erm.composer.data.model.entity.Playlist
import com.erm.composer.data.model.entity.PlaylistSongJoin
import com.erm.composer.data.model.entity.Song

@Database(
    version = 1,
    entities = [Song::class,
        Playlist::class,
        PlaylistSongJoin::class]
)
@TypeConverters(Converters::class)
abstract class ComposerDatabase : RoomDatabase() {
    abstract fun playlistDao(): PlaylistDao
    abstract fun songDao(): SongDao
    abstract fun playlistSongJoinDao(): PlaylistSongJoinDao
}