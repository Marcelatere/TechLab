package com.techlab.inicio;

public class Clase3Formateo {
    public static String formatearNombreProducto(String nombre) {
        nombre = nombre.trim().toLowerCase();//Paso 1
        String[] palabras = nombre.split(" ");//Paso 2
        StringBuilder sb = new StringBuilder();//Paso 3
        for (String palabra : palabras) {//Paso 4
            if (!palabra.isEmpty()) {
                sb.append(Character.toUpperCase(palabra.charAt(0)))//Letra inicial en mayúscula
                        .append(palabra.substring(1))//El resto en minuscula.
                        .append(" "); //Agrega espacio entre palabras
            }
        }
        return sb.toString().trim();//Quita el último espacio y retorna
    }

    public static void main(String[] args) {
        String nombreFormateado = formatearNombreProducto("   el cafe es muy rico   ");
        System.out.println("Producto Formateado: " + nombreFormateado);
    }
}

