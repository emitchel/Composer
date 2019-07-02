package com.erm.composer.data.db.converters

import androidx.room.TypeConverter
import com.erm.composer.util.DateTimeUtil.defaultFormatter
import org.threeten.bp.LocalDateTime

class Converters {

    @TypeConverter
    fun fromOffsetDateTime(date: LocalDateTime?): String? {
        return date?.format(defaultFormatter)
    }

    @TypeConverter
    fun toOffsetDateTime(value: String?): LocalDateTime? {
        return value?.let {
            return defaultFormatter.parse(value, LocalDateTime::from)
        }
    }

}