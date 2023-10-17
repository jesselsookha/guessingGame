package com.example.icetask3guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etGuess: EditText? = null
    private var tvDisplay: TextView? = null
    private var intRandom: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etGuess = findViewById<EditText>(R.id.etGuess)
        tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        val btnGuess = findViewById<Button>(R.id.btnGuess)
        intRandom = (1..100).shuffled().first()

        btnGuess.setOnClickListener {4
            guessedNumber()
        }
    }

    private fun guessedNumber(){
        var intGuessNumber = etGuess?.text.toString().toInt()

        if (intGuessNumber == intRandom){
            tvDisplay?.text = "= Your number is the correct guess"
        } else {
            if (intGuessNumber > intRandom){
                tvDisplay?.text = "> Your guess is larger than mine"
            } else {
                tvDisplay?.text = "< Your guess is less than mine"
            }
        }
    }
}