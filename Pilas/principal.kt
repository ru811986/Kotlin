package principal

import pilas.*

fun main(args: Array<String>) {
    var pila = Pila(null)
    var opcionMenu: Int
    do {
        println("+----------------------------------+")
        println("|           MENU DE PILA           |")
        println("+----------------------------------+")
        println("| 1. Apilar nodo                   |")
        println("| 2. Buscar nodo                   |")
        println("| 3. Modificar nodo                |")
        println("| 4. Desapilar nodo                |")
        println("| 5. Mostrar pila                  |")
        println("| 6. Salir                         |")
        println("+----------------------------------+")
        println("Opción: ")
        opcionMenu = readLine()!!.toInt()
        when(opcionMenu) {
            1 -> {
                print("Introduzca el dato a apilar: ")
                var datoAApilar: Int = readLine()!!.toInt()
                pila.apilar(datoAApilar)
            }
            2 -> {
                print("Introduzca el dato a buscar: ")
                var datoABuscar: Int = readLine()!!.toInt()
                pila.buscar(datoABuscar)
            }
            3 -> {
                print("Introduzca el dato a modificar: ")
                var datoAModificar: Int = readLine()!!.toInt()
                print("Introduzca el dato modificado: ")
                var datoModificado: Int = readLine()!!.toInt()
                pila.modificar(datoAModificar, datoModificado)
            }
            4 -> {
                pila.desapilar()
            }
            5 -> {
                pila.mostrar()
            }
            6 -> println("PROGRAMA FINALIZADO")
            else -> println("OPCIÓN NO VÁLIDA")
        }
    } while (opcionMenu != 6)
}
