package com.techlab.inicio;

public class After2Aumento {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;

        //Crea un array bidimensional
        double[][] saldo = new double[6][5];

        //Para crear un array de una fila
        // int[] saldo2 = new int[];

        //Una forma de for
        //   for(int i = 0 ; i<6; i++)

        //Otra forma de for
        for (int i = 0; i < saldo.length; i++) {
            saldo[i][0] = 10000;
            acumulado = 10000;
            for (int j = 1; j < saldo[i].length; j++) {
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;
        }
        for (int z = 0; z < 6; z++) {
            System.out.println();
            for (int h = 0; h < 5; h++) {
                //System.out.print(saldo[z][h]); para evitar que salgan tantos decimales
                System.out.printf("%1.2f",saldo[z][h]);
                System.out.print(" ");
            }
        }
    }
}
