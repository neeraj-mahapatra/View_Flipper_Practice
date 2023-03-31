package com.example.viewflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    private lateinit var viewFlipper: ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewFlipper = findViewById(R.id.viewFlipper)

        // Add images to the ViewFlipper
        val imageIds = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
        )

        for (imageId in imageIds) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageId)
            viewFlipper.addView(imageView)
        }

        // Set animation properties for the ViewFlipper
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left)
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right)
        viewFlipper.flipInterval = 2000
        viewFlipper.isAutoStart = true
    }
}