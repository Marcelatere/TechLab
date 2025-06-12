package com.techlab.inicio;

import java.util.ArrayList;

public class Clase3EjercicioPractico1 {
    public static void main(String[] args) {
        ArrayList<String> listaProductos = new ArrayList();
        listaProductos.add("Café");
        listaProductos.add("Azúcar");
        listaProductos.add("Té");
        listaProductos.add("Capuchino");

        for (String p : listaProductos) {
            System.out.println(p);
        }
        listaProductos.remove(1);
        for (String p : listaProductos) {
            System.out.println(p);
        }
        listaProductos.remove("Capuchino");
        for (String p : listaProductos) {
            System.out.println(p);
        }
        boolean contiene = listaProductos.contains("Café");
        if (contiene == true) {
            System.out.println("La lista contiene Café");
        } else {
            System.out.println("La lista no contiene Café");
        }
    }
}