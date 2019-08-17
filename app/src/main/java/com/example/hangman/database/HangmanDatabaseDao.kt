package com.example.hangman.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface HangmanDatabaseDao {

    @Insert
    fun insert(game: Game)

    @Update
    fun update(game: Game)

    @Query("SELECT * FROM game_table WHERE gameId = :key")
    fun getGame(key: Long): Game?

    @Query("SELECT * FROM game_table")
    fun getAllGames(): LiveData<List<Game>>

    @Query("SELECT * FROM game_table ORDER BY gameId DESC")
    fun getMostRecentGame(): Game?

    @Query("DELETE FROM game_table WHERE gameId = :key")
    fun deleteGame(key: Long): Unit
}