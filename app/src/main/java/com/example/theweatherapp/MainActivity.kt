package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // on below line we are creating a variable.
    lateinit var closeApplicationBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startBtn = findViewById<Button>(R.id.startBtn)
        startBtn.setOnClickListener {
            // create the intent
            val intent = Intent(this, MainScreen::class.java)
            // start activity
            startActivity(intent)
        }
        // on below line we are creating and
        // initializing variable for activity
        val activity: MainActivity = MainActivity()

        // on below line we are initializing our variables.
        closeApplicationBtn = findViewById(R.id.btnExit)

        // on below line we are adding click listener for our button
        closeApplicationBtn.setOnClickListener {
            // on below line we are finishing activity.
            activity.finish()

            // on below line we are exiting our activity
            System.exit(0)


        }
    }
}
