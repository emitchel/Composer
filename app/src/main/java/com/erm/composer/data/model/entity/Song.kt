package com.erm.composer.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.erm.composer.data.db.converters.Converters
import org.threeten.bp.LocalDateTime

@Entity
data class Song(
    var title: String,
    @TypeConverters(Converters::class)
    var created: LocalDateTime,
    var imageLocation: String? = null,
    var recordedLocation: String? = null,
    var key: String? = null,
    var tempo: Int? = null //bpm
//TODO what does the contents look like? json?
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}