package org.example.java;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    act1(sc);
                    break;
                case 2:
                    act2(sc);
                    break;
                case 3:
                    act3(sc);
                    break;
                case 4:
                    act4(sc);
                    break;
                case 5:
                    act5(sc);
                    break;
                case 6:
                    act6(sc);
                    break;
                case 7:
                    act7(sc);
                    break;
                case 8:
                    act8(sc);
                    break;
                case 9:
                    act9(sc);
                    break;
                case 10:
                    act10(sc);
                    break;
                case 11:
                    act11(sc);
                    break;
                case 12:
                    act12(sc);
                    break;
                case 13:
                    act13(sc);
                    break;
                case 14:
                    act14(sc);
                    break;
                case 15:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    if (opcion != -1) {
                        System.out.println("Opción no válida, intente nuevamente.");
                    }
                    break;
            }
        } while (opcion != 15);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("Elige una opción:");
        System.out.println("1. Saludo personalizado");
        System.out.println("2. Número par o impar");
        System.out.println("3. Cálculo del área de un círculo");
        System.out.println("4. Generador de números aleatorios");
        System.out.println("5. Tabla de multiplicar");
        System.out.println("6. Sumar números del 1 al 100");
        System.out.println("7. Reverso de una cadena");
        System.out.println("8. Contador de vocales");
        System.out.println("9. Números primos");
        System.out.println("10. Conversión de temperaturas");
        System.out.println("11. Fibonacci");
        System.out.println("12. Inversión de un número");
        System.out.println("13. Clase Anime sencilla");
        System.out.println("14. Inventario de videojuegos");
        System.out.println("15. Salir");
    }

    public static void act1(Scanner sc) {
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

    public static void act2(Scanner sc) {
        System.out.println("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine());

        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static void act3(Scanner sc) {
        System.out.println("Introduce un número: ");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("Radio: " + radio + " | Area: " + area);
    }

    public static void act4(Scanner sc) {
        Random randomizer = new Random();

        int numRandom = randomizer.nextInt(100) + 1;
        int numero;

        do {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();

            if (numero > numRandom) {
                System.out.println("El número que buscas es menor");
            } else if (numero < numRandom) {
                System.out.println("El número que buscas es mayor");
            }
        } while (numero != numRandom);

        System.out.println("¡Has acertado! El número era " + numRandom);
    }

    public static void act5(Scanner sc) {
        System.out.println("Que tabla de multiplicar quieres ver?");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar " + numero);
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }

    public static void act6(Scanner sc) {
        int cont = 0;
        for (int i = 0; i < 100; i++) {
            cont += i;
        }
        System.out.println("La suma es: " + cont);
    }

    public static void act7(Scanner sc) {
        System.out.println("Introduce una palabra o una frase: ");
        String input = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = input.length() -1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }
        System.out.println("Palabra: " + input + " | Invertida: " + reversedString);
    }

    public static void act8(Scanner sc) {
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};
        int contadorVocales = 0;
        System.out.println("Introduce una frase: ");
        String input = sc.nextLine().toLowerCase();

        for (char letra : input.toCharArray()) {
            for (char vocal : vocales) {
                if (letra == vocal) {
                    contadorVocales++;
                    break;
                }
            }
        }

        System.out.println("Tu frase: " + input);
        System.out.println("Número de vocales: " + contadorVocales);
    }

    public static void act9(Scanner sc) {
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void act10(Scanner sc) {
        System.out.println("Elige conversor: ");
        System.out.println("1. Celsius -> Fahrenheit");
        System.out.println("2. Fahrenheit -> Celsius");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce los grados Celsius: ");
                double celsius = sc.nextDouble();
                System.out.println(celsius + "ºC = " + celsius * 9 / 5 + 32 + "ºF");
                break;
            case 2:
                System.out.println("Introduce los grados Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                System.out.println(fahrenheit + "ºF = " + (fahrenheit - 32) * 5 / 9 + "ºC");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void act11(Scanner sc) {
        int primero = 0;
        int segundo = 1;

        System.out.println("Introduce los números de la secuencia de Fibonacci: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = 0;
        }

        for (int i = 1; i <= num; i++) {
            System.out.println(primero);

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }

    public static void act12(Scanner sc) {
        System.out.println("Introduce una secuencia de numeros: ");
        String numeros = sc.nextLine();

        StringBuilder reversedString = new StringBuilder();
        for (int i = numeros.length() -1; i >= 0; i--) {
            reversedString.append(numeros.charAt(i));
        }

        System.out.println("Números originales: " + numeros);
        System.out.println("Números invertidos: " + reversedString);
    }

    public static void act13(Scanner sc) {
        System.out.println("Introduce el nombre del anime: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce los episodios del anime: ");
        int episodios = sc.nextInt();
        System.out.println("Introduce el genero del anime: ");
        String genero = sc.nextLine();

        Anime anime = new Anime(nombre,episodios,genero);

        System.out.println(anime);
    }

    public static void act14(Scanner sc) {
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("""
                ¿Qué deseas hacer?
                1. Agregar videojuego.
                2. Eliminar videojuego.
                3. Mostrar videojuegos.
                4. Salir
            """);

            System.out.println("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    Videojuego videojuego = inventario.crearVideojuego();
                    inventario.agregarVideojuego(videojuego);
                }
                case 2 -> inventario.eliminarVideojuego();
                case 3 -> inventario.mostrarInventario();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 4);
    }
}
