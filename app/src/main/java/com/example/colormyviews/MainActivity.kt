package com.example.colormyviews

import android.R.color
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.colormyviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                binding.boxOneText, binding.boxTwoText, binding.boxThreeText,
                binding.boxFourText, binding.boxFiveText, binding.constraintLayout,
                binding.redButton, binding.yellowButton, binding.greenButton
            )


        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(color.holo_green_light)
            R.id.box_five_text -> view.setBackgroundResource(color.holo_green_light)
            //boxes with buttons background color change.
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}

// Ideas.. Use images instead of colors, and reveal the images. You can even create a picture memory game!
//Use one image and break it up into sections to reveal over time.
//Get rid of the text and buttons and just fill the screen with boxes. Implement one of Piet Mondrian's Paintings!
//Take the AboutMe app and remake it using ConstraintLayout with a more creative arrangement of information.
//Style the app to uniquely represent you and your personality.