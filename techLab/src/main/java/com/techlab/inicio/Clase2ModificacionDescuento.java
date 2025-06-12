package com.techlab.inicio;
import java.util.Scanner;
public class Clase2ModificacionDescuento {
    public static void main(String[] args) {
        float precioUnitario = 123.45f;
        int stock = 1000;
        Scanner entrada = new Scanner(System.in);
        System.out.print("¡Hola! Ingrese su Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println(nombre + " le informamos que si compra más de 100 productos tendrá un descuento del 15%");
        System.out.print(nombre + ", Ingrese la cantidad de Productos que quiere comprar: ");
        int cantidadProd = entrada.nextInt();

        if (cantidadProd > stock) {
            System.out.print("Lo sentimos " + nombre + ", no tenemos esa cantidad en nuestro stock, sólo tenemos " + stock + " productos");
        } else {
            float costoTotal = precioUnitario * cantidadProd;
            if (cantidadProd > 100) {
                float descuento = costoTotal * 0.15f;
                costoTotal = costoTotal - descuento;
                System.out.print(nombre + ", el costo total de los " + cantidadProd + " Productos es: $" + costoTotal);
                System.out.print(". Tu descuento fue de $" + descuento);
            } else {
                System.out.print(nombre + ", el costo total de los " + cantidadProd + " Productos es: $" + costoTotal);
            }
        }
    }
}
