package com.techlab.inicio.Clase5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto teclado = new Producto("teclado red draGon", 20000);

        Producto mouse = new Producto(12875,"mouse");
        //Producto teclado = new Producto();
        teclado.nombre = "teclado rEd    draGon";
        teclado.precio = 20000.45;
        teclado.stock = 13;

        ArrayList<Producto> listaDeProductos = new ArrayList<>();
        Producto monitor = new Producto("monitor", 345.67);
        Producto microfono = new Producto("micrófono", 2548.40);
        Producto webcam = new Producto(123.65,"Webcam");
        listaDeProductos.add(monitor);
        listaDeProductos.add(microfono);
        listaDeProductos.add(teclado);
        listaDeProductos.add(mouse);
        listaDeProductos.add(webcam);


        teclado.descontarStock();
        System.out.println(teclado.precioConDescuento());
        System.out.println(teclado.capitalize());
        teclado.reporteProducto();
        mouse.reporteProducto();
    }
}
