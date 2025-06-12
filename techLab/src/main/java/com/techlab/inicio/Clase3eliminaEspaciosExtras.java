package com.techlab.inicio;

public class Clase3eliminaEspaciosExtras {
    public static void main(String[] args) {
        String producto = "  Cafe Premium MOLIDO  ";
        producto = producto.trim().toLowerCase();
        System.out.println(producto);
    }
}
