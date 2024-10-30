package com.example.tobuy

import androidx.room.Database
import androidx.room.RoomDatabase
import android.content.Context
import androidx.room.Room

import com.example.tobuy.models.entities.User
import com.example.tobuy.models.entities.Product
import com.example.tobuy.models.entities.ShopList
import com.example.tobuy.models.entities.Category
import com.example.tobuy.models.entities.Address
import com.example.tobuy.models.entities.ProductInShopList

import com.example.tobuy.models.dao.UserDao
import com.example.tobuy.models.dao.ProductDao
import com.example.tobuy.models.dao.ShopListDao
import com.example.tobuy.models.dao.CategoryDao
import com.example.tobuy.models.dao.AddressDao
import com.example.tobuy.models.dao.ProductInShopListDao



@Database(entities = [User::class, Product::class, ShopList::class, Category::class, Address::class, ProductInShopList::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun productDao(): ProductDao
    abstract fun shopListDao(): ShopListDao
    abstract fun categoryDao(): CategoryDao
    abstract fun addressDao(): AddressDao
    abstract fun productInShopListDao(): ProductInShopListDao

    companion object {
        private const val DATABASE_NAME = "toBuyDatabase"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }



    }
}