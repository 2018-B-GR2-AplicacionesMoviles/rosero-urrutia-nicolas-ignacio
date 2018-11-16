package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toggle_switch.*

class ToggleSwitch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_switch)

        toggleButton1.setOnClickListener(){
            if(toggleButton1.isChecked){
                Toast.makeText(this,"Toggle encendido",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Toggle apagado",Toast.LENGTH_SHORT).show()
            }
        }

        switch3.setOnClickListener {

            if(switch3.isChecked){
                Toast.makeText(this,"Switch encendido",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Switch apagado",Toast.LENGTH_SHORT).show()
            }

        }
    }




}
