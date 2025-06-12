package com.techlab.inicio;

public class Clase4Ejercicio3Profe {
    public static void main(String[] args) {
        int[] stock = {20, 35, 12};
        System.out.println("Stock antes de reponer");
        mostrarArray(stock);

        reponerStock(stock, 1, 10);
        System.out.println("Stock después de reponer");
        mostrarArray(stock);
    }


    public static void reponerStock(int[] stock, int indice, int cantidad){
        if (indice >= 0 && indice < stock.length){
            stock[indice] += cantidad;
        }
        else {
            System.out.println("Índice de stock inválido");
        }
    }

    public static void mostrarArray(int[] arr){
        for(int item : arr){
            System.out.println(item + " ");
        }
        System.out.println();
    }
}
