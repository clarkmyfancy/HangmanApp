package com.example.hangman.GuessWord

import android.database.DatabaseUtils
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import java.lang.StringBuilder
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.hangman.R
import com.example.hangman.databinding.FragmentGuessWordBinding

class GuessWord : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentGuessWordBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_guess_word,
            container,
            false)

        return binding.root

    }


//    private lateinit var binding: ActivityGuessWordBinding

//    private var game = Game()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = DataBindingUtil.setContentView(this, R.layout.fragment_guess_word)
//

//    }


}


