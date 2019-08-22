package com.example.hangman.GuessWord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.hangman.R
import com.example.hangman.databinding.FragmentGuessWordBinding
import kotlinx.android.synthetic.main.fragment_guess_word.*

class GuessWord : Fragment() {

    private lateinit var viewModel: GuessWordViewModel
    private lateinit var binding: FragmentGuessWordBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_guess_word,
            container,
            false
        )

        viewModel = ViewModelProviders.of(this).get(GuessWordViewModel::class.java)

        val args = GuessWordArgs.fromBundle(arguments!!)
        binding.disguisedWordTextView.text = args.secretWord

        setClickListeners()

//        viewModel.word.observe(this, Observer { changedWord ->
////            Log.i("EnterWord", "observer on word invoked, word changed")
////            binding.enterWordText.setText(changedWord)
////        })

        return binding.root
    }

    fun setClickListeners() {
        val clickableButtons: List<View> =
            listOf(binding.aButton, binding.bButton, binding.cButton,
                binding.dButton, binding.eButton, binding.fButton,
                binding.gButton, binding.hButton, binding.iButton,
                binding.jButton, binding.kButton, binding.lButton,
                binding.mButton, binding.nButton, binding.oButton,
                binding.pButton, binding.qButton, binding.rButton,
                binding.sButton, binding.tButton, binding.uButton,
                binding.vButton, binding.wButton, binding.xButton,
                binding.yButton, binding.zButton
            )

        for (item in clickableButtons) {
            item.setOnClickListener {
                evaluateGuess(it)
            }
        }
    }

    private fun evaluateGuess(view: View) {

        // when the user clicks the button, it should be hidden or something,
        // I want it to appear red, but not be clickable
        when (view.id) {
            R.id.a_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.b_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.c_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.d_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.e_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.f_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.g_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.h_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.i_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.j_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.k_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.l_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.m_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.n_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.o_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.p_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.q_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.r_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.s_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.t_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.u_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.v_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.w_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.x_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.y_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }

            R.id.z_button -> {
                view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light))
                view.isEnabled = false
            }
        }
    }

}



