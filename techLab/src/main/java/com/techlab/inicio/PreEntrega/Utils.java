package com.techlab.inicio.PreEntrega;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Normalizer;
import java.util.Scanner;


public class Utils {
    public static void hacerLinea() {
        String cadena = "=";
        String repetida = cadena.repeat(54);
        System.out.println(repetida);
    }

    public static String removerAcentos(String texto) {
        if (texto == null) {
            return null;
        }
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return normalizado.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
    public static String formatearNombre(String nombre){
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
    public static String formatearNumero(double numero) {
            DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
            simbolo.setGroupingSeparator('.');
            simbolo.setDecimalSeparator(',');
            DecimalFormat formato = new DecimalFormat("#,##0.00",simbolo);
        return formato.format(numero);
    }

    public static void pausarParaContinuar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPresione ENTER para continuar...");
        sc.nextLine();
    }


}
