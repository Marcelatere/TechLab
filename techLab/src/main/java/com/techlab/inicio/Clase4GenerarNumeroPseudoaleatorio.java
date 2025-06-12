package com.techlab.inicio;

public class Clase4GenerarNumeroPseudoaleatorio {
    public static void main(String[] args) {
    int numero = generarNumeroEnteroAleatorio(5,10);
        System.out.println(numero);
    }
    public static int generarNumeroEnteroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
    }
}
