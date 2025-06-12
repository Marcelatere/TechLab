package com.techlab.inicio;

import java.util.ArrayList;

public class Clase3Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("Yerba Mate");
        listaProductos.add("Azúcar");
        listaProductos.add("Café La Virginia");
        listaProductos.add("Café Dolca");
        listaProductos.add("Edulcorante");
        int contador = listaProductos.size();
        System.out.println(contador);
        listaProductos.remove(4);
        listaProductos.remove("Café La Virginia");
        contador = listaProductos.size();
        System.out.println(contador);

    for(int i = 0; i < contador ; i++){
        String variable = listaProductos.get(i);
        System.out.println(variable);
       }
    if (listaProductos.contains("Café Dolca")){
            System.out.println(listaProductos.indexOf("Café Dolca"));
        }
    }
}
