package com.techlab.inicio;

public class Clase2if {
    public static void main(String[] args) {
        int edad = 18;
        String nombre = "Marcela";
        if(edad >= 18 && (nombre == "Marcela" || nombre == "marcela")){
            System.out.println(nombre + " Sos mayor de edad");
        } else {
            System.out.println("Sos menor de edad");
        }
    }
   }