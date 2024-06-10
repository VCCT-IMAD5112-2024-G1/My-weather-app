package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {
    // on below line we are creating a variable.
    lateinit var closeApplicationBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val weatherBtn = findViewById<Button>(R.id.weatherBtn)
        weatherBtn.setOnClickListener {
            // create the intent
            val intent = Intent(this, DetailScreen::class.java)
            // start the activity
            startActivity(intent)
        }
        // on below line we are creating and
        // initializing variable for activity
        val activity: MainScreen = MainScreen()

        // on below line we are initializing our variables.
        closeApplicationBtn = findViewById(R.id.btnExit2)

        // on below line we are adding click listener for our button
        closeApplicationBtn.setOnClickListener {
            // on below line we are finishing activity.
            activity.finish()

            // on below line we are exiting our activity
            System.exit(0)
        }
    }
}

