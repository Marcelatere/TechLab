package com.techlab.inicio;

public class Clase3QuitarEspaciosEntremedio {
    public static void main(String[] args) {
        String nombre = "Marcela   Gimenez";
        nombre = nombre.replaceAll("\\s+", " ");
        System.out.println(nombre);
    }
}
