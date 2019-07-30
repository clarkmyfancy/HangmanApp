package com.example.hangman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

//const val COMPUTER_MESSAGE = "com.example.hangman.COMPUTER_MESSAGE"
//const val PERSON_MESSAGE = "com.example.hangman.PERSON_MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startComputerPicksRandomWordMode(view: View) {
        val intent = Intent(this, RandomWordMode::class.java).apply {
        }
        startActivity(intent)
    }

    fun startUserCreatesWordMode(view: View) {
        val intent = Intent(this, ChosenWordMode::class.java).apply{
        }
        startActivity(intent)
    }
}