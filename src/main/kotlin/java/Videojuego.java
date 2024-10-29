package org.example.java;

public class Videojuego {
    private String titulo;
    private String plataforma;
    private int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Plataforma: " + plataforma + " | Horas jugadas: " + horasJugadas;
    }
}