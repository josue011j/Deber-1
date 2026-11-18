package com.example.deber1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        // Botones de navegación: regresar, inicio y menú
        configurarBarraNavegacion()
    }
}
