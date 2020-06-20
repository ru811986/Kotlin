package ordenacionPorInseccion

fun main(args: Array<String>) {
    var numeros: IntArray = intArrayOf(1, 4, 3, 5, 2);
    for (i in 0.. numeros.size-1) {
        print("${numeros[i]}\t")
    }
    println()
    var numerosOrdenados: IntArray = ordenarPorInsercion(numeros)
    for (i in 0..numerosOrdenados.size-1) {
        print("${numerosOrdenados[i]}\t")
    }
    println()
}

fun ordenarPorInsercion(numEnteros: IntArray): IntArray {
    var j: Int
    var x: Int
    // Ordenación por inserción
    for (i in 0..numEnteros.size-1) {
        x = numEnteros[i];
        j = i
        while (j > 0 && x < numEnteros[j - 1]) {
            numEnteros[j] = numEnteros[j - 1]
            j--
        }
        numEnteros[j] = x
    }
    // ------------------------
    return numEnteros
}
