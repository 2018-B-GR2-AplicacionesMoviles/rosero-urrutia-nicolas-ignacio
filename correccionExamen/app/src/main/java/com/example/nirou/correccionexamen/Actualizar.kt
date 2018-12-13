package com.example.nirou.correccionexamen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_actualizar2.*

class Actualizar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar2)
        val Disfraz = intent.getParcelableExtra<Disfraz?>("disfraz")
        eT_nombreDisfraz2.setText(Disfraz?.nombre)
        eT_tallaDisfraz2.setText(Disfraz?.talla)
        eT_generoDisfraz2.setText(Disfraz?.genero)
        eT_precioDisfraz2.setText(Disfraz?.precio)
        var posicion = intent.getIntExtra("pos",0);

        btn_Actualizar2.setOnClickListener {
            actualizar(posicion)
        }
        btn_cancelar2.setOnClickListener {
            cancelar()
        }
        btn_Eliminar2.setOnClickListener {
            borrar(posicion)
        }
    }

    fun actualizar(posicion:Int){
        var disfraz= Disfraz(nombre = eT_nombreDisfraz2.text.toString(),
            talla =eT_tallaDisfraz2.text.toString(),genero = eT_generoDisfraz2.text.toString(),precio =eT_precioDisfraz2.text.toString())
        Log.i("actualizar-bdd", BaseDeDatos.DISFRAZ.toString())
        Log.i("actualizar-pos", posicion.toString())
        Log.i("actualizar-nuevo",disfraz.toString())
        BaseDeDatos.DISFRAZ[posicion]=disfraz
        Log.i("actualizar-bdd-ac", BaseDeDatos.DISFRAZ.toString())
        intentListar()
    }

    fun intentListar(){
        val intentActividadIntent = Intent(
            this,
            Listar::class.java
        )
        startActivity(intentActividadIntent)
    }
    fun cancelar(){
        intentListar()
    }
    fun borrar(posicion:Int){
        BaseDeDatos.DISFRAZ.removeAt(posicion)
        intentListar()
    }

}
