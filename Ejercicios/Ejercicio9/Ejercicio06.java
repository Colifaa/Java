package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dolares de guillermo");
        double guille, luis, juan;

        guille = entrada.nextDouble();

        luis = guille / 2;
        System.out.println("Luis tiene " + luis);

        juan = (luis + guille) / 2;
        System.out.println("Juan tiene " + juan);
    }
}
