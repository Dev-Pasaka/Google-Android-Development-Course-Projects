package com.example.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backBtn = findViewById<Button>(R.id.buttonBack)
        val nextActivityBtn = findViewById<Button>(R.id.buttonNextActivity)

        backBtn.setOnClickListener{
            finish()
        }
        nextActivityBtn.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}