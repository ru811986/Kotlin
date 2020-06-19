package listasSE

class ListaSE(var primero: Nodo?, var ultimo: Nodo?) {
    fun estaVacia(): Boolean = if(primero == null && ultimo == null) true else false

    fun devuelveLongitud(): Int {
        var actual: Nodo? = primero
        var longitud: Int = 0
        if(!estaVacia()) {
            while(actual != null) {
                longitud++
                actual = actual.siguiente
            }
        }
        return longitud
    }

    fun insertarAlPrincipio(datoInsertado: Int) {
        var nuevo = Nodo(datoInsertado, primero)
        primero = nuevo
        println("Elemento $datoInsertado insertado correctamente al principio de la lista simple enlazada")
    }

    fun insertarDespues(datoInsertado: Int, pos: Int) {
        var actual: Nodo? = primero
        var insertado: Boolean = false
        var posicion: Int = 0
        if (!estaVacia()) {
            while (actual != null && !insertado) {
                if (posicion == pos) {
                    var nuevo = Nodo(datoInsertado, actual.siguiente)
                    actual.siguiente = nuevo
                    insertado = true
                }
                posicion++
                actual = actual.siguiente
            }
            if (insertado) {
                println("Elemento $datoInsertado insertado correctamente en la lista simple enlazada después de la posición $pos")
            }
        }
    }

    fun buscar(datoABuscar: Int) {
        var actual: Nodo? = primero
        var encontrado: Boolean = false
        var posicion: Int = 0
        if (!estaVacia()) {
            while (actual != null && !encontrado) {
                if (actual.dato == datoABuscar) {
                    println("Elemento $datoABuscar encontrado en la posición $posicion")
                    encontrado = true
                }
                posicion++
                actual = actual.siguiente
            }
            if (!encontrado) {
                println("Elemento $datoABuscar no encontrado")
            }
        }
    }

    fun modificar(datoAModificar: Int, datoModificado: Int) {
        var actual: Nodo? = primero
        var modificado: Boolean = false
        var posicion: Int = 0
        if (!estaVacia()) {
            while (actual != null && !modificado) {
                if (actual.dato == datoAModificar) {
                    actual.dato = datoModificado
                    println("Elemento $datoAModificar modificado por $datoModificado en la posición $posicion")
                    modificado = true
                }
                posicion++
                actual = actual.siguiente
            }
            if (!modificado) {
                println("Elemento $datoAModificar no modificado, dado que no se ha encontrado")
            }
        }
    }

    fun eliminarAlPrincipio() {
        var nodoAEliminar: Nodo? = primero
        var datoEliminado: Int = nodoAEliminar!!.dato
        primero = primero?.siguiente
        println("Elemento $datoEliminado eliminado correctamente del principio de la lista simple enlazada")
    }

    fun eliminarDespues(pos: Int) {
        var actual: Nodo? = primero
        var eliminado: Boolean = false
        var posicion: Int = 0
        if (!estaVacia()) {
            var datoEliminado: Int = 0
            while (actual != null && !eliminado) {
                if (posicion == pos) {
                    var nodoAEliminar: Nodo? = actual.siguiente
                    datoEliminado = nodoAEliminar!!.dato
                    actual.siguiente = actual.siguiente?.siguiente
                    eliminado = true
                }
                posicion++
                actual = actual.siguiente
            }
            if (eliminado) {
                println("Elemento $datoEliminado eliminado correctamente de la lista simple enlazada después de la posición $pos")
            }
        }
    }

    fun mostrar() {
        var actual: Nodo? = primero
        if (!estaVacia()) {
            while (actual != null) {
                print("${actual.dato} -> ")
                actual = actual.siguiente
            }
            println("null")
        }
    }
}