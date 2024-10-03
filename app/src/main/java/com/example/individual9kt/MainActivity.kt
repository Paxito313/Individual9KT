package com.example.individual9kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val buttonFilter1 = findViewById<Button>(R.id.buttonFilter1)
        val buttonFilter2 = findViewById<Button>(R.id.buttonFilter2)
        val buttonFilter3 = findViewById<Button>(R.id.buttonFilter3)
        val buttonPredicado = findViewById<Button>(R.id.buttonPredicado)

        buttonFilter1.setOnClickListener {
            textViewResult.text = "Filter 1 applied"
        }

        buttonFilter2.setOnClickListener {
            textViewResult.text = "Filter 2 applied"
        }

        buttonFilter3.setOnClickListener {
            textViewResult.text = "Filter 3 applied"
        }

        buttonPredicado.setOnClickListener {
            textViewResult.text = "Predicado applied"
        }
    }
}
