package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflate the UI -- is transforming the XML layout into java/kotlin objects to work with
        setContentView(R.layout.activity_main)

        // DISPLAY MESSAGE BACK TO THE MAIN ACTIVITY VIEW.
        val message = intent.getStringExtra("SEND_VALUE_BACK")

        var textView: TextView = findViewById(R.id.text_message2)

        textView.text = message
        ///////////////////////////////////////////////////////////

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