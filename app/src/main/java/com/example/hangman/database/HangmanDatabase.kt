package com.example.hangman.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Game::class], version = 1, exportSchema = false)
abstract class HangmanDatabase : RoomDatabase() {

    abstract val gameDatabaseDao: HangmanDatabaseDao

    // allows clients to access class methods and properties without instantiating it
    companion object {

        @Volatile
        private var INSTANCE: HangmanDatabase? = null

        fun getInstance(context: Context): HangmanDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {

                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HangmanDatabase::class.java,
                        "hangman_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}