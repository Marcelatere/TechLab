package com.techlab.inicio;

public class Clase3Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "té CHAi";
        System.out.println(cadena);
        cadena = cadena.toUpperCase().charAt(0) + cadena.substring(1,4) + cadena.toLowerCase().charAt(4) + cadena.toLowerCase().charAt(5) + cadena.substring(6);
        System.out.println(cadena);
        System.out.println("Su longitud es: " + cadena.length() + " caracteres");
    }
}