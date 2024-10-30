package com.example.tobuy.models.dao

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ProductInShopListDao {
    @Query("SELECT * FROM product_in_shoplist WHERE id = :id")
    fun getById(id: Int): ProductInShopListDao

    @Query("SELECT * FROM product_in_shoplist WHERE productId = :productId")
    fun getByProductId(productId: Int): ProductInShopListDao

    @Query("SELECT * FROM product_in_shoplist WHERE shopListId = :shopListId")
    fun getByShopListId(shopListId: Int): ProductInShopListDao

}