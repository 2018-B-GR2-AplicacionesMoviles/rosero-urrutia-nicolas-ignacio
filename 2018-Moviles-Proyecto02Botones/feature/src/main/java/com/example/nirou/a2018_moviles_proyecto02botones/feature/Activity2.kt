package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        buttonList.setOnClickListener {
            irAListaEst()

        }

        buttonCheckBox.setOnClickListener {
            irCheckBoxMaterias()

        }

        buttonRadioGroup.setOnClickListener {
            irRadioGroup()

        }

        btnToggle.setOnClickListener {



            irToggleSwitch()

        }
    }

    fun irAListaEst(){

        //INTENT
        val intentListaEst = Intent(this, ListView::class.java)
        this.startActivity(intentListaEst)
    }

    fun irCheckBoxMaterias(){

        //INTENT
        val intentCheckBoxMaterias = Intent(this, checkBoxMaterias::class.java)
        this.startActivity(intentCheckBoxMaterias)
    }

    fun irRadioGroup(){

        //INTENT
        val intentirRadioGroup = Intent(this, RadioGroup::class.java)
        this.startActivity(intentirRadioGroup)
    }

    fun irToggleSwitch(){

        //INTENT
        val intentToggleSwitch = Intent(this, ToggleSwitch::class.java)
        this.startActivity(intentToggleSwitch)
    }
}
