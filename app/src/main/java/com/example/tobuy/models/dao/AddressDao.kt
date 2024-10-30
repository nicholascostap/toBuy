package com.example.tobuy.models.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AddressDao {
    @Query("SELECT * FROM address WHERE id = :id")
    fun getById(id: Int): AddressDao

    @Query("SELECT * FROM address WHERE cep = :cep")
    fun getByCep(cep: String): AddressDao

}