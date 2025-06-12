package com.techlab.inicio;
import java.text.NumberFormat;
//import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class After3FormateoNumeros {
    public static void main(String[] args) {
      //  Locale argentinaLocale = new Locale("es", "AR");
        int numero = 122459978;
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setGroupingSeparator('.');

        DecimalFormat formato = new DecimalFormat("#,###",simbolo);

        String numeroFormateado = formato.format(numero);
        System.out.println(numeroFormateado);
    }
}
