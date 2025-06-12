package com.techlab.inicio.PreEntrega;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


import static com.techlab.inicio.PreEntrega.Main.proximoIdDisponible;
import static com.techlab.inicio.PreEntrega.Utils.*;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Nombre: " + nombre + ", Precio: $" + formatearNumero(precio) + ", Stock: " + formatearNumero(stock);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            pausarParaContinuar();
            return;
        }
        System.out.println("Listado de productos:");
        for (Producto producto : productos) {
            System.out.println(producto); // Aquí llama a toString()
        }
        pausarParaContinuar();
    }

    static void agregarProducto(ArrayList<Producto> productos) {
        String respuesta;
        do {
            Scanner sc = new Scanner(System.in);
            hacerLinea();
            System.out.println("==== SISTEMA DE GESTIÓN - TECHLAB");
            hacerLinea();
            System.out.println("1) Agregar un producto");
            System.out.print("Nombre del Producto: ");
            String nombre = sc.nextLine();
            nombre = formatearNombre(nombre);

            double precio = -1;
            boolean precioValido = false;
            while (!precioValido) {
                try {
                    System.out.print("Precio del Producto (use punto para decimales): ");
                    precio = sc.nextDouble();
                    if (precio < 0) {
                        System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                    } else {
                        precioValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Entrada inválida para el precio. Por favor, use punto para decimales");
                    sc.nextLine();
                }
            }

            int stock = -1;
            boolean stockValido = false;
            while (!stockValido) {
                try {
                    System.out.print("Stock: ");
                    stock = sc.nextInt();
                    if (stock < 0) {
                        System.out.println("El stock no puede ser negativo. Intente de nuevo.");
                    } else {
                        stockValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Entrada inválida para el stock. Por favor, ingrese un número entero.");
                    sc.nextLine();
                }
            }
            boolean respuestaValida = false;
            respuesta = "";
            sc.nextLine();
            while (!respuestaValida) {
                System.out.print("¿Desea agregar este producto? (s/n): ");
                respuesta = sc.nextLine().trim().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    respuestaValida = true;
                } else {
                    System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
                    sc.nextLine();
                }
            }
            if (respuesta.equals("s")) {
                int id = proximoIdDisponible;
                productos.add(new Producto(id, nombre, precio, stock));
                proximoIdDisponible++;
                System.out.println("Producto agregado.");
            }
            respuestaValida = false;
            respuesta = "";
            while (!respuestaValida) {
                System.out.print("¿Desea ingresar otro producto? (s/n): ");
                respuesta = sc.nextLine().trim().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    respuestaValida = true;
                } else {
                    System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
                }
            }
        } while (respuesta.equals("s"));
    }


    static void buscarProducto(ArrayList<Producto> productos) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            opcion = -1;
            boolean idValido = false;
            while (!idValido) {
                try {
                    menuBuscar();
                    opcion = sc.nextInt();
                    sc.nextLine();
                    if (opcion < 0) {
                        System.out.println("La opción no puede ser negativa. Intente de nuevo.");
                        pausarParaContinuar();
                    } else {
                        idValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Entrada inválida para la opción. Por favor, use un numero entero");
                    sc.nextLine();
                    pausarParaContinuar();
                }
            }
            switch (opcion) {
                case 1:
                    buscarPorID(productos, sc);
                    break;
                case 2:
                    buscarPorNombre(productos, sc);
                    break;
                case 3:
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese 1 (por ID) o 2 (por Nombre).");
                    pausarParaContinuar();
                    break;
            }
        } while (opcion != 3);
    }

    static void menuBuscar() {
        hacerLinea();
        System.out.println("==== BUSCAR UN PRODUCTO POR SU ID O POR SU NOMBRE");
        hacerLinea();
        System.out.println("1 - por ID ");
        System.out.println("2 - por Nombre del Producto");
        System.out.println("3 - Volver Menú Principal");
        System.out.print("Elija una opción: ");
    }

    private static void buscarPorID(ArrayList<Producto> productos, Scanner sc) {
        String respuesta;
        do {
            hacerLinea();
            System.out.println("==== BUSCAR UN PRODUCTO POR SU ID");
            hacerLinea();
            boolean encontrado = false;
            int opcion = -1;
            boolean idValido = false;
            while (!idValido) {
                try {
                    System.out.print("Ingrese el ID del Producto: ");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    if (opcion < 0) {
                        System.out.println("El ID no puede ser negativo. Intente de nuevo.");
                    } else {
                        idValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Entrada inválida para el ID. Por favor, use un numero entero");
                    sc.nextLine();
                }
            }
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getId() == opcion) {
                    System.out.println(productos.get(i));
                    encontrado = true;
                    modificarPrecio(productos, sc, i);
                    modificarStock(productos, sc, i);
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Producto con ID " + opcion + " no fue encontrado.");
            }
            boolean respuestaValida = false;
            respuesta = "";
            while (!respuestaValida) {
                System.out.print("¿Desea buscar otro producto por ID? (s/n): ");
                respuesta = sc.nextLine().trim().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    respuestaValida = true;
                } else {
                    System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
                }
            }
        } while (respuesta.equals("s"));
    }

    private static void buscarPorNombre(ArrayList<Producto> productos, Scanner sc) {
        String respuesta;
        do {
            hacerLinea();
            System.out.println("==== BUSCAR UN PRODUCTO POR SU NOMBRE");
            hacerLinea();
            System.out.print("Ingrese el Nombre del Producto: ");
            String opcion = sc.next();
            boolean encontrado = false;
            String nombreBuscadoProcesado = removerAcentos(opcion).toLowerCase();
            for (int i = 0; i < productos.size(); i++) {
                String nombreProductoProcesado = removerAcentos(productos.get(i).getNombre()).toLowerCase();
                if (nombreProductoProcesado.contains(nombreBuscadoProcesado)) {
                    System.out.println(productos.get(i));
                    sc.nextLine();
                    encontrado = true;
                    modificarPrecio(productos, sc, i);
                    modificarStock(productos, sc, i);
                }
            }
            if (!encontrado) {
                sc.nextLine();
                System.out.println("Producto " + opcion + " no fue encontrado.");
            }
            boolean respuestaValida = false;
            respuesta = "";
            while (!respuestaValida) {
                System.out.print("¿Desea buscar otro producto por su Nombre? (s/n): ");
                respuesta = sc.nextLine().trim().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    respuestaValida = true;
                } else {
                    System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
                    }
            }
        } while (respuesta.equals("s"));
    }


    static void modificarPrecio(ArrayList<Producto> productos, Scanner sc, int i) {
        boolean respuestaValida = false;
        String respuesta = "";
        while (!respuestaValida) {
            System.out.print("¿Desea modificar el precio? (s/n): ");
            respuesta = sc.nextLine().trim().toLowerCase();
            if (respuesta.equals("s") || respuesta.equals("n")) {
                respuestaValida = true;
            } else {
                System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
            }
        }
        if (respuesta.equals("s")) {
            Producto auxiliar = productos.get(i);
            double precio = -1;
            boolean precioValido = false;
            while (!precioValido) {
                try {
                    System.out.print("Precio del Producto (use punto para decimales): ");
                    precio = sc.nextDouble();
                    sc.nextLine();
                    if (precio < 0) {
                        System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                    } else {
                        precioValido = true;
                    }
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("¡Error! Entrada inválida para el precio. Por favor, use punto para decimales");
                }
            }
            auxiliar.setPrecio(precio);
            System.out.println("Precio actualizado exitosamente.");
            System.out.println(productos.get(i));
        } else {
            System.out.println("No se modificó el precio.");
        }
    }

    static void modificarStock(ArrayList<Producto> productos, Scanner sc, int i) {
        boolean respuestaValida = false;
        String respuesta = "";
        while (!respuestaValida) {
            System.out.print("¿Desea modificar el stock? (s/n): ");
            respuesta = sc.nextLine().trim().toLowerCase();
            if (respuesta.equals("s") || respuesta.equals("n")) {
                respuestaValida = true;
            } else {
                System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
            }
        }
        if (respuesta.equals("s")) {
            Producto auxiliar = productos.get(i);
            int stock = -1;
            boolean stockValido = false;
            while (!stockValido) {
                try {
                    System.out.print("Stock del Producto: ");
                    stock = sc.nextInt();
                    sc.nextLine();
                    if (stock < 0) {
                        System.out.println("El stock no puede ser negativo. Intente de nuevo.");
                    } else {
                        stockValido = true;
                    }
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("¡Error! Entrada inválida para el stock. Por favor, use números enteros");
                }
            }
            auxiliar.setStock(stock);
            System.out.println("Stock actualizado exitosamente.");
            System.out.println(productos.get(i));
        } else {
            System.out.println("No se modificó el stock.");
        }
    }

    static void eliminarProducto(ArrayList<Producto> productos) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            hacerLinea();
            System.out.println("==== ELIMINAR UN PRODUCTO");
            hacerLinea();
            boolean encontrado = false;
            int opcion = -1;
            boolean idValido = false;
            while (!idValido) {
                try {
                    System.out.print("Ingrese el ID del Producto: ");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    if (opcion < 0) {
                        System.out.println("El ID no puede ser negativo. Intente de nuevo.");
                    } else {
                        idValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Entrada inválida para el ID. Por favor, use un numero entero");
                    sc.nextLine();
                }
            }
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getId() == opcion) {
                    productoEncontrado(sc,productos, i);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Producto con ID " + opcion + " no fue encontrado.");
            }
            boolean respuestaValida = false;
            respuesta = "";
            while (!respuestaValida) {
                System.out.print("¿Desea eliminar otro producto? (s/n): ");
                respuesta = sc.nextLine().trim().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    respuestaValida = true;
                } else {
                    System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
                }
            }
        } while (respuesta.equals("s"));
    }

    static void productoEncontrado(Scanner sc, ArrayList<Producto> productos, int i) {
        System.out.println(productos.get(i));
        String respuesta;
        boolean respuestaValida = false;
        respuesta = "";
        while (!respuestaValida) {
            System.out.print("¿Desea eliminar este producto? (s/n): ");
            respuesta = sc.nextLine().trim().toLowerCase();
            if (respuesta.equals("s") || respuesta.equals("n")) {
                respuestaValida = true;
            } else {
                System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
            }
        }
        if (respuesta.equals("s")) {
            productos.remove(i);
            System.out.println("Producto eliminado");
        }
    }

}
