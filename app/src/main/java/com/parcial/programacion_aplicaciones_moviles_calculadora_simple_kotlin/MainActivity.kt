package com.parcial.programacion_aplicaciones_moviles_calculadora_simple_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainDisplay = findViewById<Button>(R.id.goToDisplay)
        val txtInserted = findViewById<TextView>(R.id.txtInserted)

        mainDisplay.setOnClickListener {
            startActivity(
                Intent(this, MainDisplay::class.java)
                    .putExtra("message", txtInserted.text.toString())
            )
        }

    }
}