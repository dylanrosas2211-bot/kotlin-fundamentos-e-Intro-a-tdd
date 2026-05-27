package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    val resultado = if (numero > 0) "Positivo" else "No positivo"
    return resultado
}

fun clasificarNumero(numero: Int): String {
    if (numero > 10){
        return "Mayor a 10"
    }
    if (numero < 10){
        return "Menor a 10"
    }
    return "Igual a 10"
}

fun evaluarEdad(edad: Int): String {
    if (edad < 18){
        return "Menor de edad"
    }
    if (edad >= 18 && edad <= 65){
        return "Adulto"
    }
        return "Adulto mayor"
}


fun obtenerDescuento(monto: Double): Double {
   if (monto >= 100 && monto < 150) {
       return 10.0
   }
    if (monto >= 150 && monto < 200) {
        return 20.0
    }
    if (monto >= 200) {
        return 30.0
    }
    return 0.0
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    if (operador == '+' ){
        return (a + b) .toDouble()
    }
    if (operador == '-' ){
        return (a - b) .toDouble()
    }
    if (operador == '*' ){
        return (a * b) .toDouble()
    }
    if (operador == '/' ){
        if (b == 0) {
            return 0.0
        }
        return (a / b) .toDouble()
    }

    return 0.0


    TODO("Realizar operacion: + - * /. Retornar 0.0 si division por cero u operador invalido")
}
