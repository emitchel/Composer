package com.erm.composer.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.erm.composer.data.db.dao.base.BaseDao
import com.erm.composer.data.model.entity.Song

@Dao
abstract class SongDao : BaseDao<Song>() {
    @Query("select * from song")
    abstract fun getSongs(): List<Song>
}