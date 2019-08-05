package com.example.hangman

class Game {
    var secretWord: String = ""
    var disguisedWord: String = ""
    var guessedLetters: MutableList<Char> = mutableListOf<Char>()
}
