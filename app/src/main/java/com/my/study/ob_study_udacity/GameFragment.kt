package com.my.study.ob_study_udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.my.study.ob_study_udacity.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGameBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}