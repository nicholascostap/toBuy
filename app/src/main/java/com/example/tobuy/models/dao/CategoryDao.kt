package com.example.tobuy.models.dao

import androidx.room.Dao
import androidx.room.Query

@Dao
interface CategoryDao {
    @Query("SELECT * FROM category WHERE id = :id")
    fun getById(id: Int): CategoryDao

    @Query("SELECT * FROM category WHERE name = :name")
    fun getByName(name: String): CategoryDao

}