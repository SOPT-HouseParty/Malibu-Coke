package com.my.study.ob_study_udacity

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.my.study.ob_study_udacity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            val clickableView: List<View> =
                listOf(
                    textView,
                    textView2,
                    textView3,
                    textView4,
                    textView5,
                    constraintlayout,
                    button,
                    button2,
                    button3
                )

            for (item in clickableView)
                item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        with(binding) {
            when (view) {
                textView -> view.setBackgroundColor(Color.DKGRAY)
                textView2 -> view.setBackgroundColor(Color.GRAY)
                textView3 -> view.setBackgroundResource(android.R.color.holo_green_light)
                textView4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
                textView5 -> view.setBackgroundResource(android.R.color.holo_green_light)
                button -> textView3.setBackgroundResource(R.color.my_red)
                button2 -> textView4.setBackgroundResource(R.color.my_yellow)
                button3 -> textView5.setBackgroundResource(R.color.my_green)
                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}