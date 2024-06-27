package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dos números: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double resultado;

        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }

        System.out.println("El resultado es: " + resultado);
    }

}
