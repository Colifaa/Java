


import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir las variables para la compra, descuento y precio final
        double compra, descuento, precioFinal;
        
        // Solicitar al usuario que ingrese la cantidad a pagar
        System.out.println("Digite la cantidad a pagar:");
        compra = scanner.nextDouble();
        
        // Calcular el descuento si la compra supera los $100
        if (compra > 100) {
            descuento = compra * 0.20;
        } else {
            descuento = 0;
        }
        
        // Calcular el precio final
        precioFinal = compra - descuento;
        
        // Mostrar el precio final a pagar
        System.out.println("El precio a pagar es: $" + precioFinal);
        
      
        scanner.close();
    }
}
