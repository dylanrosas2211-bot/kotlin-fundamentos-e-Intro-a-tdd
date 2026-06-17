package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var acumulador = 0
    for (i in 1..n) {
        acumulador = acumulador + i
    }
    return acumulador
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin) {
        if (i % 2 == 0) {
            contador++
        }
    }
    return contador
}

fun fibonacci(n: Int): Int {
    if (n == 0) {
        return 0
    }
    if (n == 1) {
        return 1
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun factorial(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}


fun encontrarMaximo(numeros: List<Int>): Int {
    var mayor: Int = 0
    var lista: Int = numeros.size - 1
    for (i in 0..lista) {
        if (numeros[i] > mayor) {
            mayor = numeros[i]
        }
    }
    return mayor
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]

    for (i in numeros.indices) {
        if (numeros[i] < minimo) {
            minimo = numeros[i]
        }
    }
    return minimo
}


fun sumarLista(numeros: List<Int>): Int {
    var suma = 0

    for (numero in numeros) {
        suma += numero
    }
    return suma
}

fun invertir(texto: String): String {
    var invertida = ""

    for (i in texto.length - 1 downTo 0) {
        invertida += texto[i]
    }

    return invertida
}

fun contarVocales(texto: String): Int {
    var contador = 0

    for (letra in texto.lowercase()) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contador++
        }
    }

    return contador
}


fun esPalindromo(texto: String): Boolean {
    val sinEspacios = texto.replace(" ", "").lowercase()
    var invertido = ""

    for (i in sinEspacios.length - 1 downTo 0) {
        invertido += sinEspacios[i]
    }

    return sinEspacios == invertido
}


fun tablaMultiplicar(numero: Int): List<Int> {
    val tabla = mutableListOf<Int>()

    for (i in 1..10) {
        tabla.add(numero * i)
    }
    return tabla
}