package com.techlab.inicio;

public class Clase4Ejercicio3 {
    public static void main(String[] args) {

        //Otra forma de definir el array
        //int[] stock = new int[3];
        //stock[0] = 56;
        //stock[1] = 128;
        //stock[2] = 48;

        //Una forma de definir el array
        int[] stock = {56,128,48};
        System.out.println("Stock antes de reponer");
        mostrarArray(stock);

        reponerStock(stock, 1, 10);

        System.out.println("Stock después de reponer");
        mostrarArray(stock);

    }

    public static void reponerStock(int[] stock, int indiceProducto, int unidadesVendidas) {
        stock[indiceProducto] -= unidadesVendidas;
    }

   public static void mostrarArray(int[] stock){
       for(int i = 0; i<3; i++){
            System.out.println(stock[i]);
       }
    }
}