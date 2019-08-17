package com.example.hangman.EnterWord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.hangman.R
import com.example.hangman.databinding.FragmentEnterWordBinding

class EnterWordFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentEnterWordBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_enter_word,
            container,
            false
        )

        return binding.root
    }
}