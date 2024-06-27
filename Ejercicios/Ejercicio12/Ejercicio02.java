package Ejercicios.Ejercicio12;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los valores de a y b
        System.out.println("Ingrese el valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de b:");
        double b = scanner.nextDouble();

        // Calcular (a + b)^2 utilizando la fórmula (a + b)^2 = a^2 + b^2 + 2*a*b
        double cuadradoDeLaSuma = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;

        // Mostrar el resultado
        System.out.println("El cuadrado de la suma es: " + cuadradoDeLaSuma);

        // Cerrar el scanner
        scanner.close();
    }
}
