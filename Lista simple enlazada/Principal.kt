package listasSE_principal

import listasSE.ListaSE

fun main(args: Array<String>) {
    var listaSe: ListaSE = ListaSE(null, null)
    var opcionMenu: Int
    do {
        println("+---------------------------------------------------+")
        println("|           MENU DE LISTA SIMPLE ENLAZADA           |")
        println("+---------------------------------------------------+")
        println("| 1. Insertar nodo al principio                     |")
        println("| 2. Insertar nodo después                          |")
        println("| 3. Buscar nodo                                    |")
        println("| 4. Modificar nodo                                 |")
        println("| 5. Eliminar nodo al principio                     |")
        println("| 6. Eliminar nodo después                          |")
        println("| 7. Mostrar lista simple enlazada                  |")
        println("| 8. Salir                                          |")
        println("+---------------------------------------------------+")
        print("Opción: ")
        opcionMenu = readLine()!!.toInt()
        when(opcionMenu) {
            1 -> {
                print("Introduzca el dato a insertar al principio: ")
                var datoAInsertar: Int = readLine()!!.toInt()
                listaSe.insertarAlPrincipio(datoAInsertar)
            }
            2 -> {
                print("Introduzca el dato a insertar después de una posición: ")
                var datoAInsertar: Int = readLine()!!.toInt()
                print("Introduzca la posición después de la cual insertar el dato: ")
                var posicion: Int = readLine()!!.toInt()
                listaSe.insertarDespues(datoAInsertar, posicion)
            }
            3 -> {
                print("Introduzca el dato a buscar: ")
                var datoABuscar: Int = readLine()!!.toInt()
                listaSe.buscar(datoABuscar)
            }
            4 -> {
                print("Introduzca el dato a modificar: ")
                var datoAModificar: Int = readLine()!!.toInt()
                print("Introduzca el dato modificado: ")
                var datoModificado: Int = readLine()!!.toInt()
                listaSe.modificar(datoAModificar, datoModificado)
            }
            5 -> {
                listaSe.eliminarAlPrincipio()
            }
            6 -> {
                print("Introduzca la posición después de la cual eliminar el dato: ")
                var posicion: Int = readLine()!!.toInt()
                listaSe.eliminarDespues(posicion)
            }
            7 -> {
                listaSe.mostrar()
            }
            8 -> print("PROGRAMA FINALIZADO")
            else -> print("OPCIÓN NO VÁLIDA")
        }
    } while (opcionMenu != 8);
}