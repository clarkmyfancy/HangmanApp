package com.example.hangman.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game_table")
data class Game (

    @PrimaryKey(autoGenerate = true)
    var gameId: Long = 0L,

    @ColumnInfo(name = "did_player_win")
    var didPlayerWin: Boolean = false,

    @ColumnInfo(name = "secret_word")
    var secretWord: String = ""
)