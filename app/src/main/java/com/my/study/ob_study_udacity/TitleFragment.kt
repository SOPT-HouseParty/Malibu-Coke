package com.my.study.ob_study_udacity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.my.study.ob_study_udacity.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
            layoutInflater,
            R.layout.fragment_title,
            container,
            false
        )

        /*binding.button.setOnClickListener{
            //Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment) 아래와 같은 역할인데 코틀린 확장함수로 아래와 같이 줄일 수 있다.
            it.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }*/

        binding.button.setOnClickListener( //위의 주석처리된 코드와 같은 역할이다. navigation이 onClickListener를 만들 수 있기 때문에 이렇게 될 수 있다.
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
        return binding.root
    }
}