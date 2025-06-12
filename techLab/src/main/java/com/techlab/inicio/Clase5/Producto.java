package com.techlab.inicio.Clase5;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Producto {
//descripción (atributos)
    String nombre;
    double precio;
    int stock;

//public Producto(){} es lo mismo que poner new Producto estoy construyendo un nuevo producto
    //public Producto(){};

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
       // this.stock = stock;
        //this.stock = 50;
    }

    public Producto(double precio,String nombre){
        this.nombre = nombre;
        this.precio = precio;
    }

//funcionamiento (métodos)
    void descontarStock(){
        //todo
        System.out.println("Descontando Stock");
    }

    double precioConDescuento(){
        return precio - (precio * 0.2);
    }
    String capitalize(){
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

    String separadorDeMiles(double numero){
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setGroupingSeparator('.');
        simbolo.setDecimalSeparator(',');


        DecimalFormat formato = new DecimalFormat("#,###.##", simbolo);
        //String numeroFormateado = formato.format(numero);
        //return numeroFormateado;
        return formato.format(numero);
    }
    void reporteProducto(){
        String nombreFormateado = capitalize();
        System.out.println("Datos del Producto");
        System.out.println("Nombre: " + nombreFormateado);
        System.out.println("Nombre: " + capitalize());
        System.out.println("Precio: $" + separadorDeMiles(precio));
        System.out.println("Stock: " + stock);
    }

}
