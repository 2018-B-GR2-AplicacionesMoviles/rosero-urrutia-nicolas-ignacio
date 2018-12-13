package com.example.nirou.correccionexamen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BaseDeDatos.agregarDisfraz(Disfraz("Spiderman",talla = "s",genero = "m",precio = "15"))
        BaseDeDatos.agregarDisfraz(Disfraz("Batman",talla = "m",genero = "f",precio = "20"))
        BaseDeDatos.agregarDisfraz(Disfraz("Superman",talla = "l",genero = "f",precio = "25"))
        btn_agregar.setOnClickListener{
            this.crear()
        }

        btn_lista.setOnClickListener{
            this.listar()



        }
    }

    fun crear(){
        val intentActividadIntent = Intent(
            this,
            Agregar::class.java
        )
        startActivity(intentActividadIntent)
    }
    fun listar(){
        val intentActividadIntent = Intent(
            this,
            Listar::class.java
        )
        startActivity(intentActividadIntent)
    }
}
