package com.example.hangman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.hangman.databinding.FragmentTitleScreenBinding

class TitleScreen : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentTitleScreenBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_title_screen,
            container,
            false
        )

        binding.startButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_titleScreen_to_selectGameMode)
        )

        return binding.root
    }
}