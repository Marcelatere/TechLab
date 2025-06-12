package com.techlab.inicio;

public class Clase3formateoavanzado {
    public static void main(String[] args) {
        String nombre = "maRcela";
        String apellido = "giMeneZ";
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1).toLowerCase();
        apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1).toLowerCase();
        System.out.println(nombre + " " + apellido);
    }
}
