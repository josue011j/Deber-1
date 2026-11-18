package com.example.deber1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btnActividad1)
        val btn2 = findViewById<Button>(R.id.btnActividad2)
        val btn3 = findViewById<Button>(R.id.btnActividad3)

        // Redirección a la Actividad 2 (Fondo Rosado)
        btn1.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }

        // Redirección a la Actividad 3 (Verde y Celeste)
        btn2.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }

        // Redirección a la Actividad 4 (Diseño Complejo)
        btn3.setOnClickListener {
            startActivity(Intent(this, Activity4::class.java))
        }
    }
}
