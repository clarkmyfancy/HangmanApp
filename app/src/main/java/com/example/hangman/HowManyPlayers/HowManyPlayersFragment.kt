package com.example.hangman.HowManyPlayers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.hangman.R
import com.example.hangman.databinding.FragmentHowManyPlayersBinding

class HowManyPlayersFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentHowManyPlayersBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_how_many_players,
            container,
            false
        )

        return binding.root
    }

}