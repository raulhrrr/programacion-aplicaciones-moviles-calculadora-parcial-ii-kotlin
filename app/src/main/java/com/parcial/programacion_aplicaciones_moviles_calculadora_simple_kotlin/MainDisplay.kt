package com.parcial.programacion_aplicaciones_moviles_calculadora_simple_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainDisplay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_display)

        val txtEntered = findViewById<TextView>(R.id.txtEntered)
        val message = intent.getStringExtra("message")
        val mainHome = findViewById<Button>(R.id.goToHome)

        txtEntered.text = message

        mainHome.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
        }
    }
}