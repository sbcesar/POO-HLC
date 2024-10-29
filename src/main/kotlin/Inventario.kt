package org.example

class Inventario {

    private val inventario: MutableList<Videojuego> = mutableListOf()

    fun crearVideojuego(): Videojuego {
        println("Dime el titulo del videojuego: ")
        val titulo = readln()
        println("Dime la plataforma del videojuego: ")
        val plataforma = readln()
        println("Dime las horas jugadas del videojuego: ")
        val horasJugadas = readln().toInt()

        val videojuego = Videojuego(titulo, plataforma, horasJugadas)

        return videojuego
    }

    fun agregarVideojuego(videojuego: Videojuego) {
        if (!inventario.contains(videojuego)) {
            inventario.add(videojuego)
            println("El videojuego ${videojuego.titulo} agregado al inventario.")
        } else {
            println("El videojuego ya está en la lista.")
        }
    }

    fun eliminarVideojuego() {
        println("Introduce el nombre del videojuego: ")
        val nombreVideojuego = readln()

        inventario.forEach { juego ->
            if (juego.titulo == nombreVideojuego) {
                inventario.remove(juego)
                println("El videojuego ${juego.titulo} ha sido eliminado al inventario.")
            } else {
                println("El videojuego no está en la lista.")
            }
        }
    }

    fun mostrarInventario() {
        inventario.forEachIndexed { indice, juego ->
            println("$indice. $juego") }
    }
}