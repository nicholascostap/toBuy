package com.example.tobuy.models.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE uid = :uid")
    fun getById(uid: Int): UserDao

    @Query("SELECT name FROM users WHERE uid = :uid")
    fun getName(uid: Int): String

    @Query("SELECT * FROM users WHERE email LIKE :email LIMIT 1")
    fun getByEmail(email: String): UserDao

    @Query("SELECT * FROM users WHERE email LIKE :email AND password LIKE :password LIMIT 1")
    fun signIn(email: String, password: String): UserDao {
        return getByEmail(email)
    }

    @Query("INSERT INTO users (name, email, password, addressId) VALUES (:name, :email, :password, :addressId)")
    fun signUp(name: String, email: String, password: String, addressId: String)

    @Query("UPDATE users SET password = :password WHERE email = :email")
    fun updatePassword(email: String, password: String)

}