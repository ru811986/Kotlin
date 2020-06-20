package ordenacionPorSeleccion

fun main(args: Array<String>) {
    var numeros: IntArray = intArrayOf(1, 4, 3, 5, 2);
    for (i in 0.. numeros.size-1) {
        print("${numeros[i]}\t")
    }
    println()
    var numerosOrdenados: IntArray = ordenarPorSeleccion(numeros)
    for (i in 0..numerosOrdenados.size-1) {
        print("${numerosOrdenados[i]}\t")
    }
    println()
}

fun ordenarPorSeleccion(numEnteros: IntArray): IntArray {
    // Ordenación por selección
    var minimo: Int
    var x: Int
    for (i in 0..numEnteros.size-2) {
        minimo = i
        for (j in i+1..numEnteros.size-1) {
            if (numEnteros[j] < numEnteros[minimo]) {
                minimo = j
            }
            x = numEnteros[minimo]
            numEnteros[minimo] = numEnteros[i]
            numEnteros[i] = x
        }
    }
    // ------------------------
    return numEnteros
}