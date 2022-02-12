package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnClick = findViewById<Button>(R.id.button)
        val showText= findViewById<TextView>(R.id.textView)
        var count=0

        btnClick.setOnClickListener {

            showText.text="Count "+ count
            count--
        }
    }
}
