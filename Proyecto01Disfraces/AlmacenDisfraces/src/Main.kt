import java.util.*
import kotlin.collections.ArrayList


fun main(args: Array<String>){




    BaseDeDatos.llenarBase()


//loop primer menu

    while (true) {

        println(" ♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠\n")
        println("☻Bienvenido☻ a la Tienda de Disfraces 'Don Nacho' \n")
        println("                 ☻Menu Principal☻                  \n")
        println(" 1.Realizar Compra")
        println(" 2.Consultar Facturas")
        println(" 3.Salir")
        println(" ♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠\n")

        println("Ingrese la Opcion: ")
        val reader = Scanner(System.`in`)
        var controlMenu: Int = reader.nextInt()

        //println(controlMenu)

        var auxDisfraz=0;
        var auxCantidad=0;
        var auxNombreCliente="";
        var auxCedulaCliente="";

        when (controlMenu) {

        //Menu 1
            1 ->{
                println("☻Bienvenido☻ a la Tienda de Disfraces 'Don Nacho' \n")

                var disfrazInit=Disfraz(1,"Super","l",1,12.0)
                var detallInicial= Detalle(1,disfrazInit)
                var arryLstDetalleAux= arrayListOf<Detalle>(detallInicial)
                arryLstDetalleAux.removeAt(0)

                while(true) {


                    println("              ☻Lista de Productos☻                  \n")

                    //Imprimir disfraces


                    BaseDeDatos.imprimirDisfraces()


                    println(" \nEscoja numero de Disfraz: ")
                    auxDisfraz = reader.nextInt()
                    println(" \nCantidad de Disfraces")
                    auxCantidad = reader.nextInt()


                    var valStock=BaseDeDatos.validarStockDisfraz(auxDisfraz,auxCantidad)


                    if(valStock==true) {
                        var disfrazAux = BaseDeDatos.disfraces.get(auxDisfraz - 1)

                        var detalleAux = Detalle(auxCantidad, disfrazAux)
                        arryLstDetalleAux.add(detalleAux)


                        BaseDeDatos.disminuirStockDisfraz(auxDisfraz - 1,disfrazAux,auxCantidad)


                    }else{
                        println(" \nNo hay suficiente Stock del Producto")

                    }
                    println("Desea comprar un nuevo disfraz?\n 1.Si 2.No")
                    var controlM:Int=reader.nextInt()



                    if(controlM==2) break
                }


                    println(" \n\nIngrese el nombre del cliente")
                    auxNombreCliente= readLine()!!
                    println(" \n\nIngrese la cedula del Cliente")
                    auxCedulaCliente= readLine()!!



                    println(" \n\n\n\n\n\n")

                    var lastPosFact:Int=BaseDeDatos.facturas.lastIndex+2

                    var cliente=Cliente(auxNombreCliente,auxCedulaCliente)


                    var total:Double= Factura.CalcularTotal(auxCantidad,arryLstDetalleAux)

                    var facturaAux=Factura(lastPosFact,total,cliente,arryLstDetalleAux)

                    BaseDeDatos.facturas.add(facturaAux)

                    facturaAux=BaseDeDatos.facturas.get(BaseDeDatos.facturas.lastIndex)
                    println("♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠  \n" +
                            "♠                Disfraces Don Nacho             \n"+
                            "♠ Factura: ${facturaAux.idFac}\n" +
                            "♠ Nombre del Cliente: ${facturaAux.cliente.nombreCliente}\t\t CI Cliente:${facturaAux.cliente.cedula}")


                        Factura.ImprimirDetalle(arryLstDetalleAux)

                        println(
                            "♠\n\t\t\t\t\t\t\t\t\t\t\t\tTotal: ${facturaAux.total}\n"+
                            "♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠  ")


                    println("☻Compra Realziada con Exito☻")
                    println( "♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠  ")
                    println("\n\n\n\n\n\n\n")
                    println( "♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠  ")
                    println("\n")



                }

        //Imprimir
            2 -> {

                println("\nConsultar Facturas: \n")
                BaseDeDatos.imprimirFacturas()
                println("\n\n\n\n\n\n\n")

                println ("♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠•♠  ")
            }

        //Fin
            3 -> {  println("☻HASTA PRONTO☻")
                return}
        }

    }


}


class BaseDeDatos{
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


        fun imprimirDisfraces() {


            for (e in disfraces) {

                println("${e.idDisfraz}\t${e.nombreDisfraz} \t\t${e.talla} \t${e.cantidad}\t ${e.precio}")

            }
        }
         fun imprimirFacturas() {


             for (e in facturas) {

                 println("ID factura: ${e.idFac}\t Cliente:${e.cliente.nombreCliente}" +
                         " \t CI Cliente:${e.cliente.cedula}" +
                         "\t\t Total: ${e.total} ")

             }


         }


        fun validarStockDisfraz(pos:Int,cantidad:Int):Boolean{

            var disfrazAux = BaseDeDatos.disfraces.get(pos - 1)

            if(disfrazAux.cantidad<cantidad||disfrazAux.cantidad<=0||cantidad<=0){
                return false
            }
            return true

        }

        fun disminuirStockDisfraz(pos:Int,disfraz: Disfraz, cantidad: Int){

                  var auxDisfraz=disfraz
            auxDisfraz.cantidad-=cantidad
                    disfraces.set(pos,auxDisfraz)

        }


    }


    fun agregarCliente(nombreCliente:String,cedula:String){

        //  _nombreDisfraz:String,_talla:String,_cantidad:Int,_precio:Double

        val clienteAux=Cliente(nombreCliente,  cedula)
        clientes.add(clienteAux)

    }

    fun agregarFactura( nombreTienda:String, cliente:Cliente,disfraz: Disfraz){

        //  _nombreDisfraz:String,_talla:String,_cantidad:Int,_precio:Double

      //  val facturaAux=Factura(1, ,cliente,disfraz)

      //  facturas.add(facturaAux)

    }

    fun CalcularTotal(cant: Int, costoU: Double, detalle: ArrayList<Detalle>): Double {

        var auxInt = 0.0

        for (e in detalle) {

            auxInt += (e.cantidadDetalle.toDouble() * e.disfraz.precio)


        }
        return auxInt

    }



    }


    fun imprimirClientes(){


    }

    fun imprimirFacturas(){



    }




