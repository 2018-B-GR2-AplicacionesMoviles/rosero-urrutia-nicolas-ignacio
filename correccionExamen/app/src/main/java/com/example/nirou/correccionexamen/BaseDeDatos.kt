package com.example.nirou.correccionexamen

class BaseDeDatos{
    companion object {
        val DISFRAZ: ArrayList<Disfraz> = ArrayList()


        fun agregarDisfraz(disfraz:Disfraz){
            DISFRAZ.add(disfraz)
        }
    }
}