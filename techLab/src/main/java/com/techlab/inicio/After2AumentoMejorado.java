package com.techlab.inicio;

public class After2AumentoMejorado {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;


        double[][] saldo = new double[6][5];   //Crea un array bidimensional


        // int[] saldo2 = new int[];   //Para crear un array de una fila


        //   for(int i = 0 ; i<6; i++)  //Una forma de for


        for (int i = 0; i < saldo.length; i++) {  //Otra forma de for
            saldo[i][0] = 10000;
            acumulado = 10000;
            for (int j = 1; j < saldo[i].length; j++) {
                acumulado += acumulado * interes;
                saldo[i][j] = acumulado;
            }
            interes += 0.01;
        }

        // Encabezado de tasas de interés
        System.out.println("Años ->     1         2         3         4         5");
        System.out.println("------------------------------------------------------");
        String cadena = "-";
        String repetida = cadena.repeat(54);
        System.out.println(repetida);

        interes = 0.10;

        for (int i = 0; i < saldo.length; i++) {
            System.out.printf("Interés %.0f%%: ", interes * 100);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%9.2f ", saldo[i][j]);
            }
            System.out.println();
            interes += 0.01;
        }
    }
}