package com.example.tamagotchiapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dogImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dogImageView = findViewById(R.id.dogImageView)


        val feedButton = findViewById<Button>(R.id.feedButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)

        feedButton.setOnClickListener {
            // Change pet image to eating image
            dogImageView.setImageResource(R.drawable.dogeating)
            // Update status text
            // Update pet status (e.g., hunger)
            Toast.makeText(this, "Feeding the dog", Toast.LENGTH_SHORT).show()
        }

        playButton.setOnClickListener {
            // Change pet image to playing image
            dogImageView.setImageResource(R.drawable.dogplaying)
            // Update status text
            // Update pet status (e.g., happiness)
            Toast.makeText(this, "Playing with the dog", Toast.LENGTH_SHORT).show()
        }

        cleanButton.setOnClickListener {
            // Change pet image to cleaning image
            dogImageView.setImageResource(R.drawable.dogcleaning)
            // Update status text
            // Update pet status (e.g., cleanliness)
            Toast.makeText(this, "Cleaning the dog", Toast.LENGTH_SHORT).show()
        }
    }
}
