package com.example.hangman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

val SECRET_WORD = "com.example.hangman.SECRETWORD"

class ChosenWordMode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chosen_word_mode)
    }

    fun submitSecretWord(view: View) {
        val secretWord = findViewById<TextView>(R.id.enterSecretWord).text.toString()

        val intent = Intent(this, GuessWord::class.java).apply {
            putExtra(SECRET_WORD, secretWord)
        }

        // if no word was entered, stay in current activity
        if (secretWord.length > 0) {
            startActivity(intent)
        }
    }
}
