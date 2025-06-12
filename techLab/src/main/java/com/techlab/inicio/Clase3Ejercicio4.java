package com.techlab.inicio;

import java.util.ArrayList;

public class Clase3Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> listaDesprolija = new ArrayList<>();
        listaDesprolija.add("      YERrBa     mATE");
        listaDesprolija.add("    AZúCar   ");
        listaDesprolija.add("Café     La Virginia    ");
        listaDesprolija.add("CaFÉ      dOLcA     ");
        listaDesprolija.add("   EDULCorAnTe    ");
        listaDesprolija.add(4, " Laaa  aaaaa vvvv");

        int contador = listaDesprolija.size();
        for (int i = 0 ; i < contador; i++){
            System.out.println(listaDesprolija.get(i));
        }
        //acá Profe le saco los espacios de más y lo pongo en una variable llamada auxiliar
        for (int i = 0 ; i < contador ; i++){
            String auxiliar = listaDesprolija.get(i);
            auxiliar = auxiliar.trim();
            auxiliar = auxiliar.replaceAll("\\s+", " ");
            listaDesprolija.set(i, auxiliar);

        }
        for (int i = 0 ; i < contador; i++){
            System.out.println(listaDesprolija.get(i));
        }
    }
}
