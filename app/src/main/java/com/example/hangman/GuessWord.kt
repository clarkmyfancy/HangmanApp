package com.example.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder
import androidx.databinding.DataBindingUtil
import com.example.hangman.databinding.ActivityGuessWordBinding

class GuessWord : AppCompatActivity() {

    private lateinit var binding: ActivityGuessWordBinding

    private var game = Game()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_guess_word)

        val secretWord = intent.getStringExtra(SECRET_WORD).toString()
        game.secretWord = secretWord
        val disguisedWord = this.disguiseWord(secretWord)
        binding.disguisedWordTextView.text = this.generatePrintableWord(disguisedWord)
    }

    fun disguiseWord(secretWord: String): String {
        val length = secretWord.length
        var disguisedWord = ""
        for (i in 1..length) {
            disguisedWord = disguisedWord + "_"
        }
        this.game.disguisedWord = disguisedWord
        return disguisedWord
    }

    private fun generatePrintableWord(disguisedWord: String): CharSequence? {
        val builder =  StringBuilder()
        for (i in 0 until disguisedWord.length) {
            if (disguisedWord[i] == "_".single()) {
                builder.append("_ ")
            } else {
                builder.append(disguisedWord[i])
            }

        }
        return builder
    }

    fun evaluateGuess(view: View) {
        val guessedLetter: Char?
        var letterInWord = false

        // check is to cast view to type Button
        if (view is Button) {
            guessedLetter = view.text.single()
            letterInWord = game.secretWord.contains(guessedLetter, true)
            if (letterInWord) {
                val newDisguisedWord = this.generateNewDisguisedWord(guessedLetter)
                this.updateDisguisedWord(newDisguisedWord)
                // update the button to go away a little
            } else {
                // put the letter in the wrong guesses box
            }
            val black = getResources().getColor(R.color.black)
            // make the button go away a little
            view.setBackgroundColor(black)
        }
    }

    fun generateNewDisguisedWord(guess: Char): String {
        val lowercaseGuess = guess.toLowerCase()
        val length = this.game.secretWord.length
        var candidateGuessUpdate = StringBuilder()

        // for each space in disguised word:
        for (i in 0 until length) {
            // if secretword[i] is in guessed letters
            if (this.game.guessedLetters.contains(this.game.secretWord[i])) {
                // reveal letter in disguised letters
                candidateGuessUpdate.append(this.game.secretWord[i])
            }
            // else if new guess == secretword[i]
            else if (lowercaseGuess == this.game.secretWord[i]) {
                // reveal letter in disguesed letters
                candidateGuessUpdate.append(lowercaseGuess)
                // add new guess to guessedLetters
                this.game.guessedLetters.add(lowercaseGuess)
            }
            else {
                candidateGuessUpdate.append("_")
            }
        }
        return candidateGuessUpdate.toString()
    }

    fun updateDisguisedWord(dWord: String) {
        binding.disguisedWordTextView.text = this.generatePrintableWord(dWord)
    }
}



