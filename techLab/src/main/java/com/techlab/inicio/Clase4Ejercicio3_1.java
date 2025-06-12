package com.techlab.inicio;
import java.util.ArrayList;

public class Clase4Ejercicio3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> stock = new ArrayList<>();
        stock.add(56);
        stock.add(128);
        stock.add(48);

        System.out.println("Stock antes de reponer");
        mostrarArray1(stock);

        reponerStock1(stock, 1, 10);

        System.out.println("Stock después de reponer");
        mostrarArray1(stock);

    }

    public static void reponerStock1(ArrayList<Integer> stock, int indiceProducto, int unidadesVendidas) {
        int variable = stock.get(indiceProducto);
        variable -= unidadesVendidas;
        stock.set(indiceProducto, variable);
    }

   public static void mostrarArray1(ArrayList<Integer> stock){
      // for(int i = 0; i<3; i++){
            System.out.println(stock);
      // }
    }
}