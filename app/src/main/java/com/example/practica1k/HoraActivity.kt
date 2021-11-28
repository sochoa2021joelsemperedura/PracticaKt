package com.example.practica1k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practica1k.HoraActivity.ConstanteHora.EXTRA_HORA

class HoraActivity : AppCompatActivity() {


    object ConstanteHora{
        //constante que guardara la hora actual
        const val EXTRA_HORA = "HoracActivity.HORA"
    }
    lateinit var tvMensajeHora : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hora)

        iniciaViews()
        var recurso : String
        var stringFormateada : String
        var hora :String

        recurso = getString(R.string.stFormateada)
        hora = intent.getStringExtra(EXTRA_HORA).toString()
        stringFormateada = String.format(recurso,hora,getString(R.string.stMiNombre))

        tvMensajeHora.setText(stringFormateada)
    }

    fun iniciaViews(){
        tvMensajeHora = findViewById(R.id.tvMensajeHora)
    }
}