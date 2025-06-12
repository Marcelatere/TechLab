package com.techlab.inicio;

public class Clase4FormatearNombre {
    public static void main(String[] args) {
        String nombreFormateado = formatearNombreProducto("cafe starbucks");
        System.out.println("Producto formateado: " + nombreFormateado);
    }
        public static String formatearNombreProducto (String nombre){
            nombre = nombre.trim().toLowerCase();
            String[] palabras = nombre.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    sb.append(Character.toUpperCase(palabra.charAt(0)))
                            .append(palabra.substring(1)).append(" ");
                }
            }
            return sb.toString().trim();
        }
}