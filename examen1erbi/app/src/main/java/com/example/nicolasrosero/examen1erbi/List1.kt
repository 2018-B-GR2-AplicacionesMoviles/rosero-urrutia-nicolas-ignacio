package com.example.nicolasrosero.examen1erbi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list1.*


class List1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list1)


        BaseDeDatos.llenarBase()

        var adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1,BaseDeDatos.disfraces)
        listLista.adapter=adapter


    }
}
