package com.example.hangman.GuessWord

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.hangman.R
import com.example.hangman.databinding.FragmentGuessWordBinding

class GuessWord : Fragment() {

    private lateinit var viewModel: GuessWordViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentGuessWordBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_guess_word,
            container,
            false)

        val args = GuessWordArgs.fromBundle(arguments!!)
        binding.disguisedWordTextView.text = args.secretWord
        Toast.makeText(context, args.secretWord, Toast.LENGTH_LONG).show()

//        viewModel.word.observe(this, Observer { changedWord ->
////            Log.i("EnterWord", "observer on word invoked, word changed")
////            binding.enterWordText.setText(changedWord)
////        })

        return binding.root
    }
}



