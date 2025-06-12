package com.techlab.inicio;
public class Clase4ImprimirRecibo {

public static void main(String[] args) {
    imprimirRecibo("Café",15.50, 13.95);
}

    public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal){
        System.out.println("Recibo de Compra");
        System.out.println("Producto: " + producto);
        System.out.println("Precio Original: " + precioOriginal);
        System.out.println("Precio con Descuento: " + precioFinal);
    }
}
