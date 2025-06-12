package com.techlab.inicio;

public class Clase4Ejercicio1 {
    public static void main(String[] args) {
        double resultado = calcularImpuesto(123.56, 15);
        System.out.printf("El Impuesto es: $ %.2f%n", resultado);
        //System.out.println(calcularImpuesto(123.56, 15));  Otra forma de imprimir la función
    }
    public static double calcularImpuesto(double precio, double porcentaje){
        return precio + (precio * porcentaje/100);
    }
}
