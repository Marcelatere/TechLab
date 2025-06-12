package com.techlab.inicio;

import java.util.Scanner;

public class Clase4Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tipo de Cliente(1:Nuevo 2:Recurrente): ");
        int cliente = sc.nextInt();
        while (cliente != 1 && cliente != 2) {
            System.out.print("Error, debe ingresar (1:Nuevo 2:Recurrente): ");
            cliente = sc.nextInt();
        }
        if (cliente == 1) {
            Mensaje("Bienvenido!!");
            }
        else{
            System.out.print("Ingrese su número de Cliente: ");
            int numeroCliente = sc.nextInt();
            Mensaje("Un gusto verlo de nuevo Cliente Número: ", numeroCliente);
            }
    }

    public static void Mensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static void Mensaje(String mensaje, int cantidad){
        System.out.println(mensaje + cantidad);
    }
}
