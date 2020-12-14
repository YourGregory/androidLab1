package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var submitButton: Button
    lateinit var editText: EditText
    lateinit var string: String
    lateinit var textView: TextView
    lateinit var btnActTwo: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Lab 1"
        submitButton = findViewById(R.id.submitButton)
        editText = findViewById(R.id.editTextTextPersonName)
        textView = findViewById(R.id.nameTextView)

        submitButton.setOnClickListener {
            string = editText.text.toString()
            textView.text = string
        }
        btnActTwo = findViewById(R.id.btnActTwo)
        btnActTwo.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}