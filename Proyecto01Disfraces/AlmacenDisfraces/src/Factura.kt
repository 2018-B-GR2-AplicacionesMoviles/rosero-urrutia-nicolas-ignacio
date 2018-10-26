class Factura (var idFac:Int, var total:Double,var cliente:Cliente,var detalle: ArrayList<Detalle>) {


    companion object {


        //Metodos
        fun CalcularTotal(cant: Int,  detalle: ArrayList<Detalle>): Double {

            var auxInt = 0.0

            for (e in detalle) {

                auxInt += (e.cantidadDetalle.toDouble() * e.disfraz.precio)


            }
            return auxInt

        }


        fun ImprimirDetalle(detalle: ArrayList<Detalle>) {

            for (e in detalle) {

                println("\n♠ Cantidad: ${e.cantidadDetalle}\t Disfraz:${e.disfraz.nombreDisfraz}" +
                        " \t Talla:${e.disfraz.talla}\tP.u.: ${e.disfraz.precio}")


            }

        }
    }
}