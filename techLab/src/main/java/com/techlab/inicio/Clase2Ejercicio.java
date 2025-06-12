package com.techlab.inicio;
import java.util.Scanner;

public class Clase2Ejercicio {
    public static void main(String[] args) {
        float precioUnitario = 123.45f;
        int stock = 1000;
        Scanner entrada = new Scanner(System.in);
        System.out.print("¡Hola! Ingrese su Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print(nombre + ", Ingrese la cantidad de Productos que quiere comprar: ");
        int cantidadProd = entrada.nextInt();
        if (cantidadProd <= stock){
            float costoTotal = precioUnitario * cantidadProd;
            System.out.print(nombre + " el costo total de los " + cantidadProd + " Productos es: $" + costoTotal);}
        else {
            System.out.print("Lo sentimos " + nombre + ", no tenemos esa cantidad en nuestro stock, sólo tenemos " + stock + " productos");}
    }
}
