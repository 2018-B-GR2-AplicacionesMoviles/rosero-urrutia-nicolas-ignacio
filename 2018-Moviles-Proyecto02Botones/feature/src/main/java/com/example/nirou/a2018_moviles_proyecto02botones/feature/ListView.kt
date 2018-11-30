package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    private val arrayNombres = arrayOf("Juan","Pablo","Saul","Nicolas","Edgar")
    private val arrayEdades = arrayOf(28,24,27,22,23)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

       var adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1,arrayNombres)
        ListView1.adapter=adapter

    }
}
