package com.techlab.inicio;

public class Clase4Ejercicio4 {
    public static void main(String[] args) {
        mostrarMensaje("Café");
        mostrarMensaje("Café", 67);
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println("El producto es: " + mensaje);
    }
    public static void mostrarMensaje(String mensaje, int cantidad){
        System.out.println("El producto es: " + mensaje + " y la cantidad que hay en stock es: " + cantidad);
    }
}
