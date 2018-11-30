package com.example.nicolasrosero.examen1erbi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLista.setOnClickListener(){

            irALista()
        }

        buttonIngresar.setOnClickListener(){

            irAIngresar()

        }

    }


    fun irALista(){


        val intentLista = Intent(this, List1::class.java)
        this.startActivity(intentLista)

    }

    fun irAIngresar(){


        val intentIngresar = Intent(this, List1::class.java)
        this.startActivity(intentIngresar)


    }









}
