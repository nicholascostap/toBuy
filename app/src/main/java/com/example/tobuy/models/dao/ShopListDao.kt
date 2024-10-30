package com.example.tobuy.models.dao

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ShopListDao {
    @Query("SELECT * FROM shopList WHERE id = :id")
    fun getById(id: Int): ShopListDao

    @Query("SELECT * FROM shopList WHERE name = :name")
    fun getByName(name: String): ShopListDao

    @Query("SELECT * FROM shopList WHERE userId = :userId")
    fun getByUserId(userId: Int): ShopListDao

}