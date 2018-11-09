package com.example.nicolasrosero.a2018movilesgr2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    var nombre: String=""
    var apellido: String=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        this.capturarDatosdelIntent()

        but_but_intnent_imp
                .setOnClickListener{
                    enviarIntentCorreo()
                }

        act_but_nombre_apellido
                .text = "${this.nombre} ${this.apellido}"





    }




    fun capturarDatosdelIntent(){

        this.nombre=intent.getStringExtra("nombre")
        this.apellido=intent.getStringExtra("apellido")
    }


    fun enviarIntentCorreo(){

        val correo=but_input_correo.text
        val subject=but_input_subject.text
        val texto=but_input_texto.text

        val intent = Intent(Intent.ACTION_SEND)
        intent.type="text/html"

        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(correo,"a@a.com"))//para mandar varios correos)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        intent.putExtra(Intent.EXTRA_TEXT, texto)

        startActivity(intent)

    }

}
