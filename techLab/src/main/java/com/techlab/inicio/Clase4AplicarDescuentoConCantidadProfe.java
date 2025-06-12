package com.techlab.inicio;

public class Clase4AplicarDescuentoConCantidadProfe {
    public static void main(String[] args) {
       aplicarDescuentoConCantidad(100,10,500);
       aplicarDescuentoConCantidad(100,10,5);
    }
    public static void aplicarDescuentoConCantidad(double precio, double porcentaje, int cantidad){
        if (cantidad > 50){
            porcentaje += 5;
        }
        double descuento = (precio - precio *(porcentaje / 100)) * cantidad;
        System.out.println("Precio Final para " + cantidad + " unidades $" + descuento);
    }
}
