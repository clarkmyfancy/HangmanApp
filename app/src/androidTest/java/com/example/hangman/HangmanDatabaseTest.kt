package com.example.hangman

import androidx.room.Room
import com.example.hangman.database.Game
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.hangman.database.HangmanDatabase
import com.example.hangman.database.HangmanDatabaseDao
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.lang.Exception

@RunWith(AndroidJUnit4::class)
class HangmanDatabaseTest : junit.framework.TestCase() {

    private lateinit var gameDao: HangmanDatabaseDao
    private lateinit var db: HangmanDatabase

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext

        db = Room.inMemoryDatabaseBuilder(context, HangmanDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        gameDao = db.gameDatabaseDao
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGetGame() {
        val game = Game()
        gameDao.insert(game)
        val currentGame = gameDao.getMostRecentGame()
        assertEquals(currentGame?.didPlayerWin, false)
    }

}