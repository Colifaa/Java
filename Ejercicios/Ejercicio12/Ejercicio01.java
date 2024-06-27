package Ejercicios.Ejercicio12;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número total de horas
        System.out.println("Ingrese el número total de horas:");
        int totalHoras = scanner.nextInt();

        // Calcular el número de semanas, días y horas
        int semanas = totalHoras / (7 * 24);
        int horasRestantes = totalHoras % (7 * 24);
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;

        // Mostrar el resultado
        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");

        // Cerrar el scanner
        scanner.close();
    }
}