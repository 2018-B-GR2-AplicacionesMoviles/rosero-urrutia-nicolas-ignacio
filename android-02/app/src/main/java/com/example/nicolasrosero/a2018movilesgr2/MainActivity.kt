package com.example.nicolasrosero.a2018movilesgr2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_navegar.setOnClickListener{

            this.irAPantallaDeBotones()

        /*
            Log.i("navegacion","Hola")
            */
        }



    }


    fun irAPantallaDeBotones(){

        //INTENT

        val intentIrABotones = Intent(this, ButtonActivity::class.java)// cuando se manda el nombre de la clase es explicito
        intentIrABotones.putExtra("nombre","Nicolas")
        intentIrABotones.putExtra("apellido","Rosero")//Mandar datos a otras actividades
        // serializar y deserializar los datos para la comunicacion entre procesos
        // odra convertirlos a bytes de forma parsealable
        // en parsealeable cualquier dato como un ppbjeto y queremos mandar a otra actividad no servira parseleable
        this.startActivity(intentIrABotones)

    }


}
