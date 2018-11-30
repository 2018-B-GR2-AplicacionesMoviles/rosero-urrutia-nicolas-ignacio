package com.example.nicolasrosero.examen1erbi

class BaseDeDatos  {




    companion object {

        val disfraces = arrayListOf<Disfraz>()
        val clientes = arrayListOf<Cliente>()
        val facturas = arrayListOf<Factura>()

        fun agregarDisfraz(_idDisfraz:Int,_nombreDisfraz:String,_talla:String,_cantidad:Int,_precio:Double){

            //  _nombreDisfraz:String,_talla:String,_cantidad:Int,_precio:Double

            val disfrazAux=Disfraz(_idDisfraz,_nombreDisfraz,_talla,_cantidad,_precio)
            disfraces.add(disfrazAux)

        }


        fun llenarBase() {

            //Llenar disfraces

            val disfraz1 = Disfraz(1,"Spiderman", "s", 5, 12.0)
            disfraces.add(disfraz1)
            val disfraz2 = Disfraz(2,"Spiderman", "m", 7, 13.0)
            disfraces.add(disfraz2)
            val disfraz3 = Disfraz(3,"Spiderman", "l", 10, 20.0)
            disfraces.add(disfraz3)
            val disfraz4 = Disfraz(4,"Batman", "s", 0, 12.0)
            disfraces.add(disfraz4)
            val disfraz5 = Disfraz(5,"Batman", "m", 1, 13.0)
            disfraces.add(disfraz5)
            val disfraz6 = Disfraz(6,"Batman", "l", 2, 20.0)
            disfraces.add(disfraz6)
            val disfraz7 = Disfraz(7,"Batman", "xl", 3, 25.0)
            disfraces.add(disfraz7)
            val disfraz8 = Disfraz(8,"Spiderman", "s", 4, 12.0)
            disfraces.add(disfraz8)

            val cliente1 = Cliente("Nicolás Rosero", "1713986576")
            clientes.add(cliente1)
            val cliente2 = Cliente("Abdon Calderon", "0245789457")
            clientes.add(cliente2)
            val cliente3 = Cliente("Britney Spears", "0333477589")
            clientes.add(cliente3)

            val detalle1 = Detalle(1, disfraz1)

            val detalle2 = Detalle(2, disfraz3)

            val detalle3 = Detalle(3, disfraz4)

            val detalle4 = Detalle(1, disfraz6)

            val detalle5 = Detalle(2, disfraz3)

            val detalle6 = Detalle(3, disfraz8)

            val arryDet1 =ArrayList<Detalle>()
            val arryDet2 =ArrayList<Detalle>()
            val arryDet3 =ArrayList<Detalle>()

            arryDet1.add(detalle1)
            arryDet2.add(detalle2)
            arryDet2.add(detalle3)
            arryDet3.add(detalle4)
            arryDet3.add(detalle5)
            arryDet3.add(detalle6)


            val factura1=Factura(1,12.0,cliente1,arryDet1)
            facturas.add(factura1)
            val factura2=Factura(2,13.0, cliente2,arryDet2)
            facturas.add(factura2)
            val factura3=Factura(3,20.0,cliente3,arryDet3)
            facturas.add(factura3)

        }





    }






}