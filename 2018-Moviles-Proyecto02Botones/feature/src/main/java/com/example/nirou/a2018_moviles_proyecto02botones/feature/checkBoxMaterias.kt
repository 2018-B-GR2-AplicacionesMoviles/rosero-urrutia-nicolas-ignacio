package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_check_box_materias.*

class checkBoxMaterias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_materias)

        buttonMaterias.setOnClickListener {

            mensajeMateriasGusto()
        }

    }

    fun mensajeMateriasGusto(){
       var output="Las materias que te gustan:\n"
        if (checkBoxMatematicas.isChecked)
        {
            output+="Matematicas\n"
        }
        if (checkBoxLiteratura.isChecked)
        {
            output+="Literatura\n"
        }
        if (checkBoxProgramacion.isChecked)
        {
            output+="Programacion\n"
        }

        Toast.makeText(this,output, Toast.LENGTH_LONG).show()

    }

}
