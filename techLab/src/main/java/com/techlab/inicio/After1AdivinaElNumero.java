package com.techlab.inicio;
import java.util.Scanner;
import java.util.Random;

public class After1AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese su nombre: ");

        String usuario = scanner.nextLine();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentosMaximos = 5;
        int intento;
        boolean adivino = false;

        System.out.println("¡Bienvenido/a " + usuario + " al juego de Adivina el Número!");
        System.out.println("Estoy pensando un número entre 1 y 100");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinarlo");

        for (int i = 1 ; i <= intentosMaximos ; i++){
            System.out.print("Intento " + i + " ingresa tu número: ");
            intento = scanner.nextInt();
            if (intento == numeroSecreto) {
                System.out.println("¡🎉🎉 Felicidades " + usuario + "! Adivinaste el número en el intento " + i);
                adivino = true;
                break;
            } else if (intento < numeroSecreto){
                System.out.println("❌ Muy bajo. Intenta un número más alto.");
            } else {
                System.out.println("❌ Muy alto. Intenta un número más bajo.");
            }
        }
        boolean ver = !adivino;
        System.out.println(adivino);
        System.out.println(ver);
        if (!adivino){
            System.out.println(" 😒 Se acabaron los intentos. El número era: " + numeroSecreto);
        }
        System.out.println("Gracias por jugar. ¡Nos vemos!");
    }
}
