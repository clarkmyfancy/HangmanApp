package com.example.hangman


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.hangman.databinding.FragmentSelectGameModeBinding

class SelectGameMode : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentSelectGameModeBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_select_game_mode,
            container,
            false
        )

        binding.enterWordButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_selectGameMode_to_enterWord)
        )

        return binding.root
    }


}