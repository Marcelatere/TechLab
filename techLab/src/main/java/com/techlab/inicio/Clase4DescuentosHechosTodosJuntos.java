package com.techlab.inicio;

public class Clase4DescuentosHechosTodosJuntos {
    public static void main(String[] args) {
        String producto = "Zapatillas";
        double precioOriginal = 10000;
        double porcentajeDescuento = 10;
        double bonusFijo = 500;
        int cantidad = 60;

        double precioConDescuento = aplicarDescuento(precioOriginal,porcentajeDescuento);
        imprimirRecibo(producto + " (básico)", precioOriginal, precioConDescuento);

        double precioBonus = aplicarDescuento(precioOriginal,porcentajeDescuento, bonusFijo);
        imprimirRecibo(producto + " (premium)", precioOriginal, precioBonus);

        double precioPorCantidad = aplicarDescuentoConCantidad(precioOriginal,porcentajeDescuento,cantidad);
        imprimirRecibo(producto + " (X Cantidad)", precioOriginal, precioPorCantidad);
    }
   /* public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal){
        System.out.println("Recibo de Compra");
        System.out.println("Producto: " + producto);
        System.out.println("Precio Original: " + precioOriginal);
        System.out.println("Precio con Descuento: " + precioFinal);
    }*/
    public static double aplicarDescuentoConCantidad(double precio, double porcentaje, int cantidad){
        double descuentoFinal = porcentaje;
        if (cantidad > 50){
            descuentoFinal = porcentaje + 5;
        }
        double descuento = precio *(descuentoFinal / 100);
        return precio - descuento;
    }
    public static double aplicarDescuento(double precio, double porcentaje){
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }
    public static double aplicarDescuento(double precio, double porcentaje, double bonusFijo){
        double descuento = precio * (porcentaje / 100);
        return precio - descuento - bonusFijo;
    }
    public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal){
        System.out.println("Recibo de Compra");
        System.out.println("Producto: " + producto);
        System.out.println("Precio Original: " + precioOriginal);
        System.out.println("Precio con Descuento: " + precioFinal);
    }
}
