package com.example.saveoncountinstance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var incrementNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun incrementValue(view: View) {
        // increment value
        incrementNumber++
        // locate the textView and update tne number
        val textView = findViewById<TextView>(R.id.show_count)
        textView.text = incrementNumber.toString()

    }
    fun decrementValue(view: View) {
        // increment value
        incrementNumber--
        // locate the textView and update tne number
        val textView = findViewById<TextView>(R.id.show_count)
        textView.text = incrementNumber.toString()
    }
}