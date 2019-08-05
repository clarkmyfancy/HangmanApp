package com.example.hangman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog

//const val COMPUTER_MESSAGE = "com.example.hangman.COMPUTER_MESSAGE"
//const val PERSON_MESSAGE = "com.example.hangman.PERSON_MESSAGE"

// sets the tag value to conain the name of the class
val TAG = MainActivity::class.java.simpleName

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called. Score is: 129")
        // onCreate gets called when the device is rotated!!!
    }

    fun startComputerPicksRandomWordMode(view: View) {
        val intent = Intent(this, RandomWordMode::class.java).apply {
        }
        startActivity(intent)
    }

    fun startUserCreatesWordMode(view: View) {
        val intent = Intent(this, ChosenWordMode::class.java).apply{
        }
        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        view.startAnimation(bounceAnimation)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_about) {
            showInfo()
        }
        return true
    }

    private fun showInfo() {
//        val dialogTitle = getString(R.string.about_title, BuildConfig.VERSION_NAME)
        val dialogMessage = getString(R.string.about_message)
        val builder = AlertDialog.Builder(this)
//        builder.setTitle(dialogTitle)
        builder.setMessage(dialogMessage)
        builder.create().show()


    }

}