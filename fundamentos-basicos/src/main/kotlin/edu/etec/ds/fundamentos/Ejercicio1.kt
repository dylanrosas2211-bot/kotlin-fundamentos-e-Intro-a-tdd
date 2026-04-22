package edu.etec.ds.fundamentos

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun resta(a: Int, b: Int): Int {
    return a - b

}

fun multiplicacion(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Int, b: Int): Int {
    return a / b
}

fun modulo(a: Int, b: Int): Int {
    val resultado =  a % b
    return resultado
}

fun esMayorQue(a: Int, b: Int): Boolean {
    return a >= b
}

fun esMenorQue(a: Int, b: Int): Boolean {
    return a <= b
}

fun sonIguales(a: Int, b: Int): Boolean {
    return a == b
}

fun esPar(numero: Int): Boolean {
    val resultado = numero  % 2 == 0
    return resultado

}

fun esImpar(numero: Int): Boolean {
    val resultado = numero  % 2 != 0
    return resultado
}

fun valorAbsoluto(numero: Int): Int {
    TODO("Retornar el valor absoluto del numero")
}

fun maximo(a: Int, b: Int): Int {
    TODO("Retornar el mayor entre a y b")
}

fun minimo(a: Int, b: Int): Int {
    TODO("Retornar el menor entre a y b")
}
