package com.techlab.inicio.PreEntrega;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import static com.techlab.inicio.PreEntrega.Producto.*;
import static com.techlab.inicio.PreEntrega.Pedido.*;
import static com.techlab.inicio.PreEntrega.Utils.hacerLinea;
import static com.techlab.inicio.PreEntrega.Utils.pausarParaContinuar;


public class Main {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static int proximoIdDisponible = 0;
    public static int proximoPedidoDisponible = 0;

    public static void main(String[] args) {
        inicializarProductos();
        int opcion;
        do {
            opcion = leerOpcionMenu();
            if (opcion != 7) {
                ejecutarOpcion(opcion, productos);
            }
        } while (opcion != 7);
        sc.close();
        System.out.println(" ¡Muchas gracias!");
    }

    private static int leerOpcionMenu() {
        int opcion = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                mostrarMenu();
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion < 0) {
                    System.out.println("La opción no puede ser negativa. Intente de nuevo.");
                    pausarParaContinuar();
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Debes ingresar un número entero para la opción.");
                sc.nextLine();
                pausarParaContinuar();
            }
        }
        return opcion;
    }

    private static void inicializarProductos() {
        productos.add(new Producto(0, "Aceite de Girasol", 4470, 15));
        productos.add(new Producto(1, "Lomitos de Atún al natural", 2474.88, 80));
        productos.add(new Producto(2, "Sal Fina Celusal 500 g.", 1200, 50));
        proximoIdDisponible = productos.size();
    }

    private static void mostrarMenu() {
        hacerLinea();
        System.out.println("==== SISTEMA DE GESTIÓN - TECHLAB");
        hacerLinea();
        System.out.println("1) Agregar producto");
        System.out.println("2) Listar productos");
        System.out.println("3) Buscar/Actualizar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Crear un pedido");
        System.out.println("6) Listar pedidos");
        System.out.println("7) Salir");
    }

    private static void ejecutarOpcion(int opcion, ArrayList<Producto> productos) {
        if (opcion == 1) {
            agregarProducto(productos);
        } else if (opcion == 2) {
            listarProductos(productos);
        } else if (opcion == 3) {
            buscarProducto(productos);
        } else if (opcion == 4) {
            eliminarProducto(productos);
        } else if (opcion == 5) {
            crearPedido(pedidos, productos);
        } else if (opcion == 6) {
            listarPedidos(pedidos);
        } else {
            System.out.println("Opción inválida. Por favor, elige un número entre 1 y 7.");
            pausarParaContinuar();
        }
    }

}