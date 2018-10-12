/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

import java.util.Date


fun main(args : Array<String>) {
    println("Hello, world!!!")

    // Int edad =1;
    //
    // //Mutar -> Cambiarse /resignar+
    //

    var edad: Int= 29

    edad = 10

    // Inmutable no se puede cambiar nunca/ no se puede reasignar

    val edadInmutable:Int =29

    //Duck Typing
    //
    var curso = 101 //Inter
    curso=102

    var nombre = "Adrian"

    var aperllido: Char ='H'


    var casado= true

    var sueldo = 10.1

    var fechaNacimiento = Date()

    println(fechaNacimiento.toString())

    when(casado){

        false -> println("Feliz ${nombre}")
        true -> println("Triste $nombre")  //con llaves o sin llaves funciona, sin llaves es para variables normales
        else ->
        {
            // templates
            println("No me voy a ejecutar")
            println("Ni yo tampoco")

        }
    }

    var bono = if (casado) 1000.00 else 0.00

    var sueldoTotal=calcularSueldo(bono);

    println(sueldoTotal)

    val adrian=Usuario("Adrian",vApellido: "Eguez") //vNombre es el nombre del parametro que esta abajo osea que no existe   NO OLVIDAR!!!!

    println(adrian)


    println(BaseDeDatos.Usuarios)
    val bdd = BaseDeDatos()
    BaseDeDatos.agregarUsuario(nombre:"Adrian")
    println()


}


fun calcularSueldo(bono:Double): Double{

    var sueldo:Double = 800.00

    return sueldo + bono

}

fun Saludar(): Unit{
    println("Hola Mundo")

}

class Usuario(public var nombre:String ){  // este vendria a ser el primer constructor

    public var apellido : String? = null // cuando se agrega ? le decimos que algo si puede ser nulo
    public var apellidoMaterno : String? = null

    constructor( vNombre: String,vApellido:String): this(vNombre){ // 2do COnstructor y debo llmar al constructor pirmario
        this.apellido =vApellido;
    }
    constructor( vNombre: String,vApellido:String): this(vNombre){ // 3ro COnstructor y debo llmar al constructor pirmario
        this.apellido =vApellido;
    }
    /*
// esto ya pusimos en el primer cobstructor
    constructor (vNombre: String){
        this.nombre= vNombre
        nombre= vNombre
    }
*/
    override fun toString(): String{
        val apellidoMayusculas = if(!apellido.isNullOrEmpty())this.apellido?.toUpperCase() else ""
        val apellidoMaternoMayusculas = if(!apellidoMaterno.isNullOrEmpty())this.apellidoMaterno?.toUpperCase() else ""
        return "Hola $apellidoMayusculas $apellidoMaternoMayusculas" // poner llaves en el this . nombre para que funque
    }
}



open class Animal(var nombre :String){ // se le poone open para que esta clase pueda heredar




}

class Tortuga(nombre:String, var pesoCaparazon:Double):Animal(nombre){  // para heredar e implementar

    init {

        println("$nombre $pesoCaparazon")

    }

}

var animal =Animal(nombre: "Caballo")
        var george = Tortuga(nombre :"George", pesoCaparazon:12.5)

class Ejemplo{

    var nombre:String
    constructor(var nNombre:String){
        println("Estoy en el constructor")
        nombre=nNombre
    }

    init {
        println("Estoy en el init")

    }
}

val ejemplo =Ejemplo(nNombre = "Adrian")

class BaseDeDatos{
    companion object{ // el companion object va a estar igualito en todas las clases de bdd

        val Usuarios: ArrayList<String> = ArrayList()

        fun agregarUsuario(nombre:String){
            Usuarios.add(nombre)

        }
    }

}


