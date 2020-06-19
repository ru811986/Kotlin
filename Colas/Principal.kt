package colas_principal

import colas.*

fun main(args: Array<String>) {
    var cola = Cola(null, null)
    var opcionMenu: Int
    do {
        println("+----------------------------------+")
        println("|           MENU DE COLA           |")
        println("+----------------------------------+")
        println("| 1. Encolar nodo                  |")
        println("| 2. Buscar nodo                   |")
        println("| 3. Modificar nodo                |")
        println("| 4. Desencolar nodo               |")
        println("| 5. Mostrar cola                  |")
        println("| 6. Salir                         |")
        println("+----------------------------------+")
        print("Opción: ")
        opcionMenu = readLine()!!.toInt()
        when(opcionMenu) {
            1 -> {
                print("Introduzca el dato a encolar: ")
                var datoAEncolar: Int = readLine()!!.toInt()
                cola.encolar(datoAEncolar)
            }
            2 -> {
                print("Introduzca el dato a buscar: ")
                var datoABuscar: Int = readLine()!!.toInt()
                cola.buscar(datoABuscar)
            }
            3 -> {
                print("Introduzca el dato a modificar: ")
                var datoAModificar: Int = readLine()!!.toInt()
                print("Introduzca el dato modificado: ")
                var datoModificado: Int = readLine()!!.toInt()
                cola.modificar(datoAModificar, datoModificado)
            }
            4 -> {
                cola.desencolar()
            }
            5 -> {
                cola.mostrar()
            }
            6 -> println("PROGRAMA FINALIZADO")
            else -> println("OPCIÓN NO VÁLIDA")
        }
    } while (opcionMenu != 6)
}