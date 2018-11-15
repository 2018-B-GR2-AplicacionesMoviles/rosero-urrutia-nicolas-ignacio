package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_validar_humano.*

class ValidarHumano : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validar_humano)


        iBtnCarro.setOnClickListener {
            mensajeCarro()

            //INTENT
            val intentIrActivityMain = Intent(this, MainActivity::class.java)
            this.startActivity(intentIrActivityMain)

       }

        iBtnMoto.setOnClickListener {

            mensajeMoto()

        }

    }


fun mensajeMoto(){
    Toast.makeText(this,"Esto no es un carro",Toast.LENGTH_SHORT).show()

}

    fun mensajeCarro(){
        Toast.makeText(this,"No es robot Comprobado",Toast.LENGTH_SHORT).show()

    }

}

