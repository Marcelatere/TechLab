package com.techlab.inicio;

public class Clase4Ejercicio2 {
    public static void main(String[] args) {
        double resultado = calcularPrecioFinal(45.78,15,50);
        System.out.printf("El precio Final es %.2f", resultado);
    }
    public static double calcularPrecioFinal(double precio, double descuento, double cantidad){
        if(cantidad > 50){
            descuento += 5;
        }
        return precio -(precio * descuento / 100);
    }
}
