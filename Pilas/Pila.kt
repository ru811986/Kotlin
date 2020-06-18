package pilas

class Pila(var cima: Nodo?) {
    fun estaVacia(): Boolean = if (cima == null) true else false
    fun devuelveLongitud(): Int {
        var actual: Nodo? = cima
        var longitud: Int = 0
        if(!estaVacia()) {
            while (actual != null) {
                longitud++
                actual = actual.siguiente
            }
        }
        return longitud
    }
    fun apilar(datoAApilar: Int) {
        if(estaVacia()) {
            var nuevo: Nodo? = Nodo(datoAApilar, null)
            cima = nuevo
        } else {
            var nuevo: Nodo? = Nodo(datoAApilar, cima)
            cima = nuevo
        }
        println("Elemento $datoAApilar apilado correctamente")
    }
    fun buscar(datoABuscar: Int) {
        var actual: Nodo? = cima
        var encontrado: Boolean = false
        var posicion: Int = 0
        if(!estaVacia()) {
            while(actual != null) {
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
        var actual: Nodo? = cima
        var modificado: Boolean = false
        var posicion: Int = 0
        if(!estaVacia()) {
            while(actual != null) {
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
    fun desapilar() {
        var nodoAEliminar: Nodo? = cima
        cima = cima?.siguiente
        println("Elemento ${nodoAEliminar?.dato} desapilado correctamente")
    }
    fun mostrar() {
        var actual: Nodo? = cima
        if(!estaVacia()) {
            while(actual != null) {
                println(actual.dato)
                actual = actual.siguiente
            }
        }
    }
}