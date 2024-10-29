package org.example.java;

public class Anime {
    private String nombre;
    private int episodios;
    private String genero;

    // Constructor
    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nombre='" + nombre + '\'' +
                ", episodios=" + episodios +
                ", genero='" + genero + '\'' +
                '}';
    }
}
