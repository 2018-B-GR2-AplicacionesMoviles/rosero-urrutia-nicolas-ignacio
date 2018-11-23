package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_check_box_materias.*
import kotlinx.android.synthetic.main.activity_radio_group.*

class RadioGroup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_group)

        radioButtonUno.setOnClickListener(){
            var output = "Ha escogido:"

                output += "Uno\n"

            Toast.makeText(this, output, Toast.LENGTH_LONG).show()

        }

        radioButtonDos.setOnClickListener(){
            var output = "Ha escogido:"

            output += "Dos\n"
            Toast.makeText(this, output, Toast.LENGTH_LONG).show()
        }

        radioButtonTres.setOnClickListener(){
            var output = "Ha escogido:"

            output += "Tres\n"
            Toast.makeText(this, output, Toast.LENGTH_LONG).show()

        }



    }



}
