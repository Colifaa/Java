import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // EJERCICIO 3 - La CLASE 3 - La clase Scanner
        Scanner entrada = new Scanner(System.in); // aca creamos una instancia de la clase Scanner
        System.out.println("Ingrese su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo");
        var titulo2 = entrada.nextLine();
        System.out.println("resultado " + titulo2 + " " + usuario2);
    }
}
