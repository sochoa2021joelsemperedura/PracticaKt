package com.example.practica1k


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.practica1k.SaludoActivity.Constantes.EXTRA_NOMBRE

class MainActivity : AppCompatActivity() {
    //Atributos
    lateinit var etNombre: EditText
    lateinit var btnAceptar: Button
    lateinit var btnHora: Button
    lateinit var tvNombreUsuario: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicia las views
        iniciaViews()

        //clic en el boton aceptar
        btnAceptar.setOnClickListener() {
            kotlin.run {
                var mensaje = etNombre.text.toString()
                val intent = Intent(this, SaludoActivity::class.java).apply {
                    putExtra(EXTRA_NOMBRE, mensaje)
                }
                startActivity(intent)
            }
        }
        //clic en el boton dime la hora
    }

    fun iniciaViews() {
        etNombre = findViewById(R.id.etNombre)
        btnAceptar = findViewById(R.id.btnAceptar)
        btnHora = findViewById(R.id.btnHora)
        tvNombreUsuario = findViewById(R.id.tvNombreUsuario)

    }
}