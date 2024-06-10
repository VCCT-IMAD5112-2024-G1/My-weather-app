package com.example.theweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailScreen : AppCompatActivity() {
    val weather = arrayOf<String>(
        "Monday: 12° and 25°, Sunny.",
        "Tuesday: 15° and 29°, Sunny.",
        "Wednesday: 7° and 20°, Partly cloudly.",
        "Thursday: 11° and 23°, Cloudy.",
        "Friday: 16° and 31°, Sunny.",
        "Saturday: 13° and 20°, Partly cloudy.",
        "Sunday: 10° and 17°, Raining.")



    // on below line we are creating a variable.
    lateinit var closeApplicationBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen2)
        // get forecasts into text view
        val weatherForecast = findViewById<TextView>(R.id.weatherForecast)

        // add all forecasts into display string
        var weatherDisplay = ""
        weatherDisplay += "${weather[0]}\n"
        weatherDisplay += "${weather[1]}\n"
        weatherDisplay += "${weather[2]}\n"
        weatherDisplay += "${weather[3]}\n"
        weatherDisplay += "${weather[4]}\n"
        weatherDisplay += "${weather[5]}\n"
        weatherDisplay += "${weather[6]}\n"

        // set the text views to the string representation of teams
        weatherForecast.text = weatherDisplay

        // on below line we are creating and
        // initializing variable for activity
        val activity: DetailScreen = DetailScreen()

        // on below line we are initializing our variables.
        closeApplicationBtn = findViewById(R.id.btnExit3)

        // on below line we are adding click listener for our button
        closeApplicationBtn.setOnClickListener {
            // on below line we are finishing activity.
            activity.finish()

            // on below line we are exiting our activity
            System.exit(0)


        }
    }
}

