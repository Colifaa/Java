package Ejercicios.Ejercicio9;

public class Ejercicio07 {

    public static void main(String[] args) {
        // Definir constantes
        final double SALARIO_BASE = 1000.00;
        final double COMISION_POR_CARRO = 150.00;
        final double PORCENTAJE_COMISION = 0.05;

        int carrosVendidos = 10;
        double valorTotalVenta = 5000.0;

        // Calcular el salario total
        double salarioTotal = SALARIO_BASE +
                (COMISION_POR_CARRO * carrosVendidos) +
                (PORCENTAJE_COMISION * valorTotalVenta);

        // Imprimir el salario total
        System.out.printf("El salario mensual del vendedor es: $%.2f%n", salarioTotal);
    }
}
