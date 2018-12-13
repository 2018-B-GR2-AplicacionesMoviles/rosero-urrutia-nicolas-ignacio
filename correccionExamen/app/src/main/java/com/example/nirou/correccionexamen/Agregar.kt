package com.example.nirou.correccionexamen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agregar.*

class Agregar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)
        btn_Agregar.setOnClickListener {
            guardar()
        }
        btn_cancelar.setOnClickListener {
            cancelar()
        }
    }

    fun guardar(){
        var disfraz= Disfraz(nombre = eT_nombreDisfraz.text.toString(),
            talla = eT_tallaDisfraz.text.toString(),genero = eT_generoDisfraz.text.toString(),precio =eT_precioDisfraz.text.toString())
        BaseDeDatos.agregarDisfraz(disfraz)
        val intentActividadIntent = Intent(
            this,
            Listar::class.java
        )
        startActivity(intentActividadIntent)
    }
    fun cancelar(){
        val intentActividadIntent = Intent(
            this,
            MainActivity::class.java
        )
        startActivity(intentActividadIntent)
    }
}
