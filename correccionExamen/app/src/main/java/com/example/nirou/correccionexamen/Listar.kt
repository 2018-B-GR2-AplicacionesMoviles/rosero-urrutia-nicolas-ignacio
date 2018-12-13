package com.example.nirou.correccionexamen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_listar.*

class Listar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        var arregloDisfraz = BaseDeDatos.DISFRAZ


        val adapter = ArrayAdapter<Disfraz>(
            this,
            android.R.layout.simple_list_item_1,
            BaseDeDatos.DISFRAZ
        )
        list_view_disfraz.adapter = adapter;
        list_view_disfraz.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val disfraz = arregloDisfraz[position]
            enviar_disfraz(disfraz,position)
        }


    }

    fun enviar_disfraz(disfraz: Disfraz, pos:Int){
        val intentActividadIntent = Intent(
            this,
            Actualizar::class.java
        )
        intentActividadIntent.putExtra("disfraz",disfraz)
        intentActividadIntent.putExtra("pos",pos)
        startActivity(intentActividadIntent)
    }
}
