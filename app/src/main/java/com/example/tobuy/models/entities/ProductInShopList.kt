package com.example.tobuy.models.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.ColumnInfo

@Entity(
    tableName = "product_in_shoplist",
    foreignKeys = [
        ForeignKey(
            entity = ShopList::class,
            parentColumns = ["id"],
            childColumns = ["shopListId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Product::class,
            parentColumns = ["id"],
            childColumns = ["productId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class ProductInShopList (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "shopListId") val shopListId: Int,
    @ColumnInfo(name = "productId") val productId: Int
)