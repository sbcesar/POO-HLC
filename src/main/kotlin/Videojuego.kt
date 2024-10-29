package org.example

class Videojuego(
    val titulo: String,
    private val plataforma: String,
    private val horasJugadas: Int
) {
    override fun toString(): String {
        return "Titulo: $titulo | Plataforma: $plataforma | Horas jugadas: $horasJugadas"
    }
}