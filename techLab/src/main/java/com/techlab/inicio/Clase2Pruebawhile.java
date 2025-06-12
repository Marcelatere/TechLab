package com.techlab.inicio;
import java.util.Scanner;
public class Clase2Pruebawhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa solicita un número e imprime desde el 1 hasta ese número");
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        int contador = 1;
        while (contador <= numero){
            System.out.println(contador);
            contador++;
        }
    }
}
