package com.example.hangman.GuessWord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        val args = GuessWordArgs.fromBundle(arguments!!)
        binding.disguisedWordTextView.text = args.secretWord

        return binding.root
    }
}



