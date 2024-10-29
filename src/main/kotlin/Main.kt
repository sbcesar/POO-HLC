package org.example

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    var opcion: Int

    do {
        println(
            """
            Elige una opción:
            1.  Saludo personalizado
            2.  Número par o impar
            3.  Cálculo del área de un círculo
            4.  Generador de números aleatorios
            5.  Tabla de multiplicar
            6.  Sumar números del 1 al 100
            7.  Reverso de una cadena
            8.  Contador de vocales
            9.  Números primos
            10. Conversión de temperaturas
            11. Fibonacci
            12. Inversión de un número
            13. Clase Anime sencilla
            14. Inventario de videojuegos
            15. Salir
            """.trimIndent()
        )

        println("Seleccione una opción: ")
        opcion = readln().toIntOrNull() ?: -1

        when (opcion) {
            1 -> act1()
            2 -> act2()
            3 -> act3()
            4 -> act4()
            5 -> act5()
            6 -> act6()
            7 -> act7()
            8 -> act8()
            9 -> act9()
            10 -> act10()
            11 -> act11()
            12 -> act12()
            13 -> act13()
            14 -> act14()
            15 -> println("Saliendo del programa...")
            else -> println("Opción no válida, intente nuevamente.")
        }
    } while (opcion != 15)
}

fun act1() {
    println("Introduce tu nombre: ")
    val nombre = readln()

    println("¡Hola $nombre!")
}

fun act2() {
    println("Introduce un numero: ")
    val num = readln().toIntOrNull()

    if (num == null) {
        println("Illo te has equivocao'")
    } else {
        if (num%2 == 0) {
            println("Es par")
        } else {
            println("Es impar")
        }
    }
}

fun act3() {
    println("Dame un radio del circulo y te calculo el area: ")
    val radio = readln().toDouble()
    val area = PI * radio.pow(2)
    println("Radio: $radio | Area: $area")
}

fun act4() {
    val rangoNumeros = 1..100
    val numRandom = rangoNumeros.random()
    var numero: Int

    do {
        println("Introduce un número del 1 al 100: ")
        numero = readln().toInt()

        when {
            numero > numRandom -> println("El número que buscas es menor")
            numero < numRandom -> println("El número que buscas es mayor")
        }
    } while (numero != numRandom)

    println("¡Has acertado! El número era $numRandom")
}

fun act5() {
    println("Que tabla de multiplicar quieres ver?")
    val numero = readln().toInt()

    println("Tabla de multiplicar $numero")
    for (i in 0..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun act6() {
    var cont = 0
    for (i in 0..100) {
        cont += i
    }
    println("La suma es: $cont")
}

fun act7() {
    println("Introduce una palabra o una frase: ")
    val input = readln()

    println(input.reversed())
}

fun act8() {
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    var contadorVocales = 0
    println("Introduce una frase: ")
    val input = readln().lowercase()

    input.forEach { letra -> if (letra in vocales) contadorVocales += 1 }
    println("Tu frase: $input\nNumero de vocales: $contadorVocales")
}

fun act9() {
    println("Introduce un numero: ")
    val num = readln().toInt()

    if (esPrimo(num)) {
        println("El numero $num es primo")
    } else {
        println("El numero $num no es primo")
    }
}

fun esPrimo(num: Int): Boolean {
    if (num < 2) {
        return false
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}

fun act10() {
    println("Elige conversor:\n1. Celsius -> Fahrenheit\n2. Fahrenheit -> Celsius")
    val opcion = readln().toInt()

    when (opcion) {
        1 -> {
            println("Introduce los grados Celsius: ")
            val celsius = readln().toDouble()
            println("$celsius ºC = ${celsius * 9 / 5 + 32} ºF")
        }
        2 -> {
            println("Introduce los grados Fahrenheit: ")
            val fahrenheit = readln().toDouble()
            println("$fahrenheit ºF = ${(fahrenheit - 32) * 5 / 9} ºC")
        }
        else -> println("Opción no válida")
    }
}

fun act11() {
    var primero = 0
    var segundo = 1

    println("Introduce los numeros de la secuencia de fibonacci: ")
    var num = readln().toInt()

    if (num < 0) {
        num = 0
    }

    for (i in 1..num) {
        println("$primero\n")
        val siguiente = primero + segundo
        primero = segundo
        segundo = siguiente
    }
}

fun act12() {
    println("Introduce una secuencia de numeros: ")
    val numeros = readln()
    println("Números originales: $numeros\nNúmeros invertidos: ${numeros.reversed()}")
}

fun act13() {
    println("Introduce el nombre del anime: ")
    val nombre = readln()
    println("Introduce los episodios del anime: ")
    val episodios = readln().toInt()
    println("Introduce el genero del anime: ")
    val genero = readln()

    val anime = Anime(nombre,episodios, genero)

    println(anime)
}

fun act14() {
    val inventario = Inventario()
    var opcion: Int

    do {
        println("""
            ¿Que deseas hacer?
            1. Agregar videojuego.
            2. Eliminar videojuego.
            3. Mostrar videojuegos.
            4. Salir
        """.trimIndent())

        println("Elige una opción: ")
        opcion = readln().toIntOrNull() ?: -1

        when (opcion) {
            1 -> {
                val videojuego = inventario.crearVideojuego()

                inventario.agregarVideojuego(videojuego)
            }
            2 -> {
                inventario.eliminarVideojuego()
            }
            3 -> {
                inventario.mostrarInventario()
            }
        }
    } while (opcion != -1)
}




























