package com.erm.composer.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.threeten.bp.LocalDateTime

@Entity
data class Song(
    var title: String,
    var created: LocalDateTime,
    var imageLocation: String? = null,
    var recordedLocation: String? = null,
    var key: String? = null,
    var tempo: Int? = null
//TODO what does the contents look like?
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}