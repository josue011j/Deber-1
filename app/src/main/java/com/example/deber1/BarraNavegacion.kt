package com.example.deber1

import android.app.Activity
import android.content.Intent
import android.widget.ImageButton
import android.widget.PopupMenu

/**
 * Configura los 3 botones de navegación (regresar, inicio y menú)
 * que comparten las pantallas de la aplicación.
 */
fun Activity.configurarBarraNavegacion() {

    // Regresar a la pantalla anterior
    findViewById<ImageButton>(R.id.btnRegresar).setOnClickListener {
        finish()
    }

    // Ir al inicio (menú principal)
    findViewById<ImageButton>(R.id.btnInicio).setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }

    // Menú con las otras ventanas
    findViewById<ImageButton>(R.id.btnMenu).setOnClickListener { vista ->
        val popup = PopupMenu(this, vista)
        popup.menu.add(0, 1, 0, "Actividad 2 (rosado)")
        popup.menu.add(0, 2, 1, "Actividad 3 (verde y celeste)")
        popup.menu.add(0, 3, 2, "Actividad 4 (colores)")
        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                1 -> startActivity(Intent(this, Activity2::class.java))
                2 -> startActivity(Intent(this, Activity3::class.java))
                3 -> startActivity(Intent(this, Activity4::class.java))
            }
            true
        }
        popup.show()
    }
}
