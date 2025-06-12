package com.techlab.inicio;

public class Clase2if2 {
    public static void main(String[] args) {
        int edad = 18;
        String nombre = "Marcela";
        System.out.println(nombre.toUpperCase());
        if(edad >= 18 && nombre.toUpperCase().equals("MARCELA")){
            System.out.println(nombre + " Sos mayor de edad");
        } else {
            System.out.println("Sos menor de edad");
        }
    }
}
