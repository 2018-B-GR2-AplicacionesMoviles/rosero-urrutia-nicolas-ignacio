package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


   private  var contador :Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnLogin.setOnClickListener {

            Log.i("Navegacion", "Login")

            validate()

        }


    }

    fun  validate() {
        // Log.i("Return","Values "+eTName.text.equals("Admin")+eTPassword.equals("Admin"))
        if (eTName.text.toString() == "Admin" && eTPassword.text.toString() == "Admin") {

            //INTENT
            val intentIrActivity2 = Intent(this, Activity2::class.java)
            this.startActivity(intentIrActivity2)

        }else {

            contador --

            textViewInfo.text = "Numero de intentos restantes: "+contador
            if(contador == 0) {
                //btnLogin.isEnabled = false
                //INTENT
                val intentValidarHumano = Intent(this, ValidarHumano::class.java)
                this.startActivity(intentValidarHumano)
            }
        }
    }



}






