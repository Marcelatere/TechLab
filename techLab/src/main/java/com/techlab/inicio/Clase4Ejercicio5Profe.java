package com.techlab.inicio;
//Modularización de saludos
public class Clase4Ejercicio5Profe {
    public static void main(String[] args) {
        String clienteTipo = "nuevo";
        if(clienteTipo.equals("nuevo")){
            saludarClienteNuevo();
        }else {
            saludarClienteRecurrente();
        }
    }

    public static void saludarClienteNuevo(){
        System.out.println("¡Bienvenido al sistema, nuevo Cliente!");
        mostrarMensaje("Recibiste un cupón de bienvenida");
    }

    public static void saludarClienteRecurrente(){
        System.out.println("¡Gracias por volver!");
        mostrarMensaje("Tienes un 10% de descuento por fidelidad", 1);
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void mostrarMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje + " vez (" + (i + 1) + ")");
        }
    }
}
