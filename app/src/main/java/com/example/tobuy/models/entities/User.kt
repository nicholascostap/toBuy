package com.example.tobuy.models.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.ForeignKey

@Entity(
    tableName = "users",
    foreignKeys = [
        ForeignKey(
            entity = Address::class,
            parentColumns = ["id"],
            childColumns = ["addressId"]
        )
    ]
)
data class User (
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    @ColumnInfo(name = "name") val name: String? = null,
    @ColumnInfo(name = "email") val email: String?,
    @ColumnInfo(name = "phone") val phone: String? = null,
    @ColumnInfo(name = "password") val password: String?,
    @ColumnInfo(name = "addressId") val addressId: Int = 0,
    @ColumnInfo(name = "gender") val gender: String? = null,
)