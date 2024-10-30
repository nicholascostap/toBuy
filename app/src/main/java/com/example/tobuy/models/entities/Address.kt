package com.example.tobuy.models.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "address")
data class Address (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "street") val street: String?,
    @ColumnInfo(name = "city") val city: String?,
    @ColumnInfo(name = "state") val state: String?,
    @ColumnInfo(name = "cep") val cep: String?,
    @ColumnInfo(name = "userId") val userId: Int
)