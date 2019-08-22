package com.example.hangman.EnterWord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.hangman.R
import com.example.hangman.databinding.FragmentEnterWordBinding

class EnterWord : Fragment() {

    private lateinit var binding: FragmentEnterWordBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_enter_word,
            container,
            false
        )

        binding.submitButton.setOnClickListener {
            val word = getCurrentWord()
            it.findNavController().navigate(EnterWordDirections.actionEnterWordToGuessWord(word))
        }

        return binding.root
    }

    fun getCurrentWord(): String {
        return binding.enterWordText.text.toString()
    }
}