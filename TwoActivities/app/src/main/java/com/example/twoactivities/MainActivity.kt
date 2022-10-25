package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflate the UI -- is transforming the XML layout into java/kotlin objects to work with
        setContentView(R.layout.activity_main)

        val nMessageEditText: EditText  = findViewById(R.id.editText_send)

        val buttonSend : Button = findViewById(R.id.button_send)

        buttonSend.setOnClickListener{
            val secondActivityIntent = Intent(this, SecondActivity::class.java)


            var message = nMessageEditText.text.toString().trim()
            secondActivityIntent.putExtra("SEND_KEY_VALUE", message)

            startActivity(secondActivityIntent)

        }
    }
}