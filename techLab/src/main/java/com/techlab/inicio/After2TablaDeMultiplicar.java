package com.techlab.inicio;

public class After2TablaDeMultiplicar {
    public static void main(String[] args) {
        int [][] tabla = new int[10][10];

        //Llenamos la tabla de Multiplicar
        for(int i=0; i < 10; i++){
            for(int j=0; j < 10; j++){
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
        //Encabezado de columnas
        System.out.print("    ");
        for (int j = 1; j <= 10; j++){
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.println("   -----------------------------------------");
        System.out.print("   ");     //Es lo mismo que arriba
        System.out.println("-".repeat(41));//Es lo mismo que arriba

        //Filas con encabezados y valores
        for(int i=0; i < 10; i++) {
            System.out.printf("%2d |", i + 1);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }

    }
}
