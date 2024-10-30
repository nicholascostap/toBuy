package com.example.tobuy.models.dao

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM product WHERE id = :id")
    fun getById(id: Int): ProductDao

    @Query("SELECT * FROM product WHERE name = :name")
    fun getByName(name: String): ProductDao

    @Query("SELECT * FROM product WHERE categoryId = :category")
    fun getByCategory(category: String): ProductDao

    @Query("SELECT * FROM product WHERE price = :price")
    fun getByPrice(price: Double): ProductDao

    @Query("SELECT * FROM product WHERE quantity = :quantity")
    fun getByQuantity(quantity: Int): ProductDao

    @Query("SELECT * FROM product ORDER BY price")
    fun orderByMinorPrice(): ProductDao

}