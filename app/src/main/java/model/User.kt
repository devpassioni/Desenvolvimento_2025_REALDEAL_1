package model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0, // Auto generate é um comando para gerar automaticamente o id, sem que o admin precise fazer esses inputs
    val name: String,
    val age: Int,
    val password: String
)
  