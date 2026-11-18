package com.example.deber1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        // Botones de navegación: regresar, inicio y menú
        configurarBarraNavegacion()
    }
}
