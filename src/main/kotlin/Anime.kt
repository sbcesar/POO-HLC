package org.example

class Anime(
    val nombre: String,
    val episodios: Int,
    val genero: String
) {
    override fun toString(): String {
        return "Nombre: $nombre | Episodios: $episodios | Género: $genero"
    }
}