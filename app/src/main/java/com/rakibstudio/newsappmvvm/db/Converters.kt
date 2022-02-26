package com.rakibstudio.newsappmvvm.db

import androidx.room.TypeConverter
import com.rakibstudio.newsappmvvm.model.Source


class Converters {

    @TypeConverter
    fun fromSource(source: Source) = source.name

    @TypeConverter
    fun toSource(name: String) = Source(name, name)
}