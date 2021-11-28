package com.example.practica1k


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.practica1k.HoraActivity.ConstanteHora.EXTRA_HORA
import com.example.practica1k.SaludoActivity.ConstanteSaludo.EXTRA_NOMBRE
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

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
                    //Cambiamos el nombre del text view inferior
                    tvNombreUsuario.setText(mensaje)

                    //Inicia la otra activity que mostrara un saludo
                    startActivity(intent)
                }
            }

        //clic en el boton dime la hora

        btnHora.setOnClickListener(){
            kotlin.run{
                val intent = Intent(this,HoraActivity::class.java).apply {
                    putExtra(EXTRA_HORA,enviaHora().toString())
                }
                startActivity(intent)

            }
        }

    }

    fun iniciaViews() {
        etNombre = findViewById(R.id.etNombre)
        btnAceptar = findViewById(R.id.btnAceptar)
        btnHora = findViewById(R.id.btnHora)
        tvNombreUsuario = findViewById(R.id.tvNombreUsuario)

    }

    //funcion que nos devuelve la hora
    fun enviaHora(): String? {
        val horaActual = LocalDateTime.now()
        val horaFormateada = horaActual.format(
            DateTimeFormatter.ofPattern(getString(R.string.stFormatoHora)))
        return horaFormateada

    }
}