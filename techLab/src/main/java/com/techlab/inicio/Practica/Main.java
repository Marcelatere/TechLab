package com.techlab.inicio.Practica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Producto> catalogo = new ArrayList<>();
        //Producto teVerde = new Producto();
        //teVerde.nombre = "Té Verde Orgánico";
        //teVerde.precio = 180;
        //teVerde.stock = 50;
        //catalogo.add(teVerde);

        Producto nuevoProducto = new Producto("Chocolate Amargo 80%", 300, 30);
        Producto nuevoProducto2 = new Producto("Caramelos Arcor", 10, 15);
        Cliente nuevoCliente = new Cliente("Marcela Teresita","saloma_11@hotmail.com");
        nuevoProducto.mostrarInformacion(nuevoProducto.nombre, nuevoProducto.precio,nuevoProducto.stock);
        nuevoProducto2.mostrarInformacion(nuevoProducto2.nombre, nuevoProducto2.precio,nuevoProducto2.stock);

    }
}
