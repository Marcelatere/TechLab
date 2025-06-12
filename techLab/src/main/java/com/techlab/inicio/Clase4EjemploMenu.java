package com.techlab.inicio;

import java.util.Scanner;

public class Clase4EjemploMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();

        int opcion = sc.nextInt();
        ejecutarOpcion(opcion);
    }
    public static void mostrarMenu(){
        System.out.println("=== Menú de Tareas ===");
        System.out.println("1. Crear tarea");
        System.out.println("2. Ver tareas");
        System.out.println("3. Eliminar tarea");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }
    public static void ejecutarOpcion(int opcion){
        if(opcion == 1){
            crearTarea();
        } else if(opcion == 2){
            verTareas();
        } else if(opcion ==3) {
            eliminarTarea();
        } else{
            System.out.println(" ¡Hasta luego!");
        }
    }
    public static void crearTarea(){
        System.out.println("Función crearTarea() aún no implementada.");
    }
    public static void verTareas(){
        System.out.println("Función verTareas() aún no implementada.");
    }
    public static void eliminarTarea(){
        System.out.println("Función eliminarTarea() aún no implementada.");
    }
}
