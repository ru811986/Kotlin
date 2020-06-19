package colas

class Cola(var frente: Nodo?, var fin: Nodo?) {
    fun estaVacia(): Boolean = if(frente == null) true else false

    fun devuelveLongitud(): Int {
        var actual: Nodo? = frente
        var longitud: Int = 0
        if(!estaVacia()) {
            while(actual != null) {
                longitud++
                actual = actual.siguiente
            }
        }
        return longitud
    }

    fun encolar(datoAEncolar: Int) {
        if(estaVacia()) {
            var nuevo = Nodo(datoAEncolar, null)
            frente = nuevo
            fin = nuevo
        } else {
            var nuevo = Nodo(datoAEncolar, null)
            fin?.siguiente = nuevo
            fin = nuevo
        }
        println("Elemento $datoAEncolar encolado correctamente")
    }

    fun buscar(datoABuscar: Int) {
        var actual: Nodo? = frente
        var encontrado: Boolean = false
        var posicion: Int = 0
        if(!estaVacia()) {
            while (actual != null) {
                if(actual.dato == datoABuscar) {
                    println("Elemento $datoABuscar encontrado en la posición $posicion")
                    encontrado = true
                }
                posicion++
                actual = actual.siguiente
            }
            if(!encontrado) {
                println("Elemento $datoABuscar no encontrado")
            }
        }
    }

    fun modificar(datoAModificar: Int, datoModificado: Int) {
        var actual: Nodo? = frente
        var modificado: Boolean = false
        var posicion: Int = 0
        if(!estaVacia()) {
            while (actual != null) {
                if(actual.dato == datoAModificar) {
                    actual.dato = datoModificado
                    println("Elemento $datoAModificar modificado por $datoModificado en la posición $posicion")
                    modificado = true
                }
                posicion++
                actual = actual.siguiente
            }
            if(!modificado) {
                println("Elemento $datoAModificar no modificado, dado que no se ha encontrado")
            }
        }
    }

    fun desencolar() {
        var nodoAEliminar = frente
        frente = frente?.siguiente
        println("Elemento ${nodoAEliminar?.dato} desencolado correctamente")
    }

    fun mostrar() {
        var actual: Nodo? = frente
        if(!estaVacia()) {
            while (actual != null) {
                print("${actual.dato} -> ")
                actual = actual.siguiente
            }
            println("null")
        }
    }
}