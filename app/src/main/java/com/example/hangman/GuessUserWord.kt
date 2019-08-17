//package com.example.hangman
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.TextView
//import java.lang.StringBuilder
//
//class GuessUserWord : AppCompatActivity() {
//
//    class Game {
//        var secretWord: String = ""
//        var disguisedWord: String = ""
//        var guessedLetters: MutableList<Char> = mutableListOf<Char>()
//    }
//    var game = Game()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_guess_secret_word)
//
//        val secretWord = intent.getStringExtra(SECRET_WORD).toString()
//        game.secretWord = secretWord
//        val disguisedWord = this.disguiseWord(secretWord)
//        val disguisedWordView = findViewById<TextView>(R.id.disguisedWordTextView).apply {
//            text = disguisedWord
//        }
//    }
//
//    fun disguiseWord(secretWord: String): String {
//        val length = secretWord.length
//        var disguisedWord = ""
//        for (i in 1..length) {
//            disguisedWord = disguisedWord + "_"
//        }
//        this.game.disguisedWord = disguisedWord
//        return disguisedWord
//    }
//
//    fun evaluateGuess(view: View) {
//        val guessedLetter = findViewById<TextView>(R.id.askForGuess).text.toString()
//        if (this.checkIfLetterInSecretWord(guessedLetter)) {
//            val newDisguisedWord = this.generateNewDisguisedWord(guessedLetter.single())
//            this.updateDisguisedWord(newDisguisedWord)
//        } else {
//            // if letter is not in secret word
//            // flash the text box red with their guess
//            val textView = findViewById<TextView>(R.id.askForGuess)
//            textView.setTextColor(getColor(R.color.red))
//        }
//        this.clearUserGuess()
//    }
//
//    fun checkIfLetterInSecretWord(guess: String): Boolean {
//        val length = this.game.secretWord.length
//        for (i in 0 until length) {
//            if (this.game.secretWord[i] == guess.single())  {
//                return true
//            }
//        }
//        return false
//    }
//
//    fun generateNewDisguisedWord(guess: Char): String {
//        val length = this.game.secretWord.length
//        var candidateGuessUpdate = StringBuilder()
//
//        // for each space in disguised word:
//        for (i in 0 until length) {
//            // if secretword[i] is in guessed letters
//            if (this.game.guessedLetters.contains(this.game.secretWord[i])) {
//                // reveal letter in disguised letters
//                candidateGuessUpdate.append(this.game.secretWord[i])
//            }
//            // else if new guess == secretword[i]
//            else if (guess == this.game.secretWord[i]) {
//                // reveal letter in disguesed letters
//                candidateGuessUpdate.append(guess)
//                // add new guess to guessedLetters
//                this.game.guessedLetters.add(guess)
//            }
//            else {
//                candidateGuessUpdate.append("_")
//            }
//        }
//        return candidateGuessUpdate.toString()
//    }
//
//    fun updateDisguisedWord(dWord: String) {
//        val disguisedWord = findViewById<TextView>(R.id.disguisedWordTextView).apply {
//            text = dWord
//        }
//    }
//
//    fun clearUserGuess() {
//        val textView = findViewById<TextView>(R.id.askForGuess).apply {
//            text = ""
//        }
//
//        // turn the color of text view bck to black
//    }
//}
