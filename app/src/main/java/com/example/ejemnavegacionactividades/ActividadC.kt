package com.example.ejemnavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_c)

        val mensaje = intent.getStringExtra("MENSAJE")
        val mensajeDeA = intent.getStringExtra("MENSAJEA")
        val botonn = findViewById<Button>(R.id.botonn)

        Toast.makeText(this,mensaje, Toast.LENGTH_SHORT).show()

        botonn.setOnClickListener{
            finish()
        }
    }
}