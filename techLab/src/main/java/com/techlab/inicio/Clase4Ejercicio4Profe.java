package com.techlab.inicio;
//Sobrecarga de métodos
public class Clase4Ejercicio4Profe {
    public static void main(String[] args) {
        mostrarMensaje("Hola");
        mostrarMensaje("Hola", 5);
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static void mostrarMensaje(String mensaje, int veces){
        for(int i = 0; i < veces; i++){
            System.out.println(mensaje + " vez (" + (i+1) + ")");
        }
    }
}
