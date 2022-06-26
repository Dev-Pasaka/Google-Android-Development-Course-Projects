package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginpage.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener{bmi()}

    }

    fun bmi(){
        val weightTextField = binding.weightKg.text.toString()
        val weight = weightTextField.toDoubleOrNull()
        val heightweightTextField = binding.heightMeters.text.toString()
        val height =  heightweightTextField.toDoubleOrNull()

        val bmi = weight!!.div(height!!*height).toString()
        val formattedBmi = NumberFormat.getCurrencyInstance().format(bmi)
//        Toast.makeText(
//            this, "Please input Weight and Height Values greater than 0",
//            Toast.LENGTH_LONG).show()
        binding.answer.text = String.format(".2f",formattedBmi)
    }
}