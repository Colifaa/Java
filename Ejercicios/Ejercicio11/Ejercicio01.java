package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir las variables para las notas
        double nota1, nota2, nota3, promedio;

        // Solicitar al usuario que ingrese las tres calificaciones
        System.out.println("Digite las 3 calificaciones:");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();

        // Calcular el promedio
        promedio = (nota1 + nota2 + nota3) / 3;

        // Determinar si el alumno aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("El alumno está aprobado con: " + promedio);
        } else {
            System.out.println("El alumno está desaprobado con: " + promedio);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
