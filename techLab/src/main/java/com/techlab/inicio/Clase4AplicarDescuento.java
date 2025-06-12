package com.techlab.inicio;

public class Clase4AplicarDescuento {
    public static void main(String[] args) {
        double num1 = aplicarDescuento(123.45,10);
        double num2 = aplicarDescuento(123.45,10,12);
        System.out.println(num1);
        System.out.println(num2);
    }
    public static double aplicarDescuento(double precio, double porcentaje){
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }
    public static double aplicarDescuento(double precio, double porcentaje, double bonusFijo){
        double descuento = precio * (porcentaje / 100);
        return precio - descuento - bonusFijo;
    }
}


