package com.example.practica1k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practica1k.SaludoActivity.ConstanteSaludo.EXTRA_NOMBRE

class SaludoActivity : AppCompatActivity() {
    //Atributos
    lateinit var tvMensaje : TextView

    object ConstanteSaludo {
        // Constante que guardara el nombre del usuario a saludar
        const val EXTRA_NOMBRE = "SaludoActivity.NOMBRE"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //inicia views
        iniciaViews()
        val saludo : String = getString(R.string.stSaludo)
        tvMensaje.setText(saludo+" "+intent.getStringExtra(EXTRA_NOMBRE).toString())

    }

    //Funcion que inicia las views
    fun iniciaViews(){
        tvMensaje = findViewById(R.id.tvMensaje)
    }

}