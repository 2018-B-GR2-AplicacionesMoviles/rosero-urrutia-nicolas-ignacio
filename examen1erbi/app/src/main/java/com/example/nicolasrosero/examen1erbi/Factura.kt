package com.example.nicolasrosero.examen1erbi

class Factura (var idFac:Int, var total:Double, var cliente:Cliente, var detalle: ArrayList<Detalle>) {


    companion object {


        //Metodos
        fun CalcularTotal(cant: Int,  detalle: ArrayList<Detalle>): Double {

            var auxInt = 0.0

            for (e in detalle) {

                auxInt += (e.cantidadDetalle.toDouble() * e.disfraz.precio)


            }
            return auxInt

        }



        }
    }
