package com.example.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.hangman.R
import com.example.hangman.databinding.FragmentTitleScreenBinding

class TitleScreenFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentTitleScreenBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_title_screen,
            container,
            false
        )

        return binding.root
    }
}