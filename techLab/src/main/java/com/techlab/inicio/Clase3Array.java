package com.techlab.inicio;
import java.util.Arrays;

public class Clase3Array {
    public static void main(String[] args) {
        String url = "https://www.youtube.com/watch?v=QN0cO6GzYIg&list=PLf9sGAY5qChd5wvhPdbusNnP9ohK-ELdR&index=1&t=3892s";
        String[] partesUrl = url.split("/");//divide el array en partes y cada "/" indica una parte
        System.out.println(Arrays.toString(partesUrl));
        String variable = Arrays.toString(partesUrl).substring(28,103);//corta el array desde watch hasta la última letra
        System.out.println(variable);
    }
}
