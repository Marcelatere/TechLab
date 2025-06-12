package com.techlab.inicio;

public class Clase4Funciones {
    public static void main(String[] args) {
    saludar();
    System.out.println();
    suma(-5,-8);
    Clase4Funciones calc = new Clase4Funciones();
    System.out.println(calc.resta(2,1));
    System.out.println(calc.resta2(7,-5));
    int resultado = calc.resta(-2,7);
    System.out.println(resultado);

    }
    public static void saludar(){
        System.out.print("Hola");
    }
    public static void suma(int num1, int num2){
        System.out.println("La suma es: " + (num1+num2));
    }
    public int resta(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    public int resta2(int num1, int num2) {
        return num1 - num2;
    }
}