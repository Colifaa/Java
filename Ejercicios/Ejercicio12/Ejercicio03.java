package Ejercicios.Ejercicio12;

import java.util.Scanner;

public class Ejercicio03 {
    public class CalificacionFinal {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese las calificaciones
            System.out.println("Ingrese la calificación de participación:");
            double participacion = scanner.nextDouble();

            System.out.println("Ingrese la calificación del primer examen parcial:");
            double primerParcial = scanner.nextDouble();

            System.out.println("Ingrese la calificación del segundo examen parcial:");
            double segundoParcial = scanner.nextDouble();

            System.out.println("Ingrese la calificación del examen final:");
            double examenFinal = scanner.nextDouble();

            // Calcular la calificación final con las ponderaciones dadas
            double calificacionFinal = (participacion * 0.10) +
                    (primerParcial * 0.25) +
                    (segundoParcial * 0.25) +
                    (examenFinal * 0.40);

            // Mostrar el resultado
            System.out.println("La calificación final es: " + calificacionFinal);

            // Cerrar el scanner
            scanner.close();
        }
    }

}
