package org.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    private List<Videojuego> inventario = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Videojuego crearVideojuego() {
        System.out.println("Dime el título del videojuego: ");
        String titulo = scanner.nextLine();
        System.out.println("Dime la plataforma del videojuego: ");
        String plataforma = scanner.nextLine();
        System.out.println("Dime las horas jugadas del videojuego: ");
        int horasJugadas = Integer.parseInt(scanner.nextLine());

        return new Videojuego(titulo, plataforma, horasJugadas);
    }

    public void agregarVideojuego(Videojuego videojuego) {
        if (!inventario.contains(videojuego)) {
            inventario.add(videojuego);
            System.out.println("El videojuego " + videojuego.getTitulo() + " agregado al inventario.");
        } else {
            System.out.println("El videojuego ya está en la lista.");
        }
    }

    public void eliminarVideojuego() {
        System.out.println("Introduce el nombre del videojuego: ");
        String nombreVideojuego = scanner.nextLine();

        boolean encontrado = false;
        for (Videojuego juego : inventario) {
            if (juego.getTitulo().equals(nombreVideojuego)) {
                inventario.remove(juego);
                System.out.println("El videojuego " + juego.getTitulo() + " ha sido eliminado del inventario.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El videojuego no está en la lista.");
        }
    }

    public void mostrarInventario() {
        for (int indice = 0; indice < inventario.size(); indice++) {
            System.out.println(indice + ". " + inventario.get(indice));
        }
    }
}

