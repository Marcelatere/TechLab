package com.techlab.inicio;

public class Clase4AplicarDescuentoConCantidad {
    public static void main(String[] args) {
        double precioFinal = aplicarDescuentoConCantidad(234,10,500);
        System.out.println(precioFinal);
    }
    public static double aplicarDescuentoConCantidad(double precio, double porcentaje, int cantidad){
        double descuentoFinal = porcentaje;
        if (cantidad > 50){
            descuentoFinal = porcentaje + 5;
        }
        double descuento = precio *(descuentoFinal / 100);
        return precio - descuento;
    }
}
