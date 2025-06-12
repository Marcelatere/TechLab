package com.techlab.inicio.PreEntrega;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.techlab.inicio.PreEntrega.Main.proximoPedidoDisponible;
import static com.techlab.inicio.PreEntrega.Utils.*;

public class Pedido {
     private int idPedido;
     private int idProducto;
     private String nombreProducto;
     private int cantidadPedido;
     private double precioProducto;


     public Pedido(int idPedido, int idProducto, String nombreProducto, int cantidadPedido, double precioProducto) {
          this.idPedido = idPedido;
          this.idProducto = idProducto;
          this.nombreProducto = nombreProducto;
          this.cantidadPedido = cantidadPedido;
          this.precioProducto = precioProducto;
     }
     @Override
     public String toString() {
          return "N° Pedido: " + idPedido + ", IDProducto: " + idProducto + ", Nombre: "
                + nombreProducto + ", Cantidad: " + formatearNumero(cantidadPedido) + ", Precio: $"
          + formatearNumero(precioProducto);
     }

     public int getCantidadPedido() {
          return cantidadPedido;
     }

     public double getPrecioProducto() {
          return precioProducto;
     }

     static void crearPedido(ArrayList<Pedido> pedidos, ArrayList<Producto> productos) {
          String respuesta;
          double costoTotal;
          double costoFinal = 0;
          do {
               Scanner sc = new Scanner(System.in);
               Producto productoEncontrado = null;
               hacerLinea();
               System.out.println("==== CREAR UN PEDIDO");
               hacerLinea();
               boolean encontrado = false;
               boolean noHayProducto = false;
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
                         productoEncontrado = productos.get(i);
                         encontrado = true;
                         break;
                    }
               }
               if (!encontrado) {
                    System.out.println("Producto con ID " + opcion + " no fue encontrado.");
                    noHayProducto = true;
               }
               while (!noHayProducto) {
                    opcion = -1;
                    idValido = false;
                    while (!idValido) {
                         try {
                              System.out.print("Ingrese la cantidad a comprar: ");
                              opcion = sc.nextInt();
                              sc.nextLine();
                              if (opcion < 0) {
                                   System.out.println("La cantidad no puede ser negativa. Intente de nuevo.");
                              } else {
                                   idValido = true;
                              }
                         } catch (InputMismatchException e) {
                              System.out.println("¡Error! Entrada inválida para la cantidad. Por favor, use un numero entero");
                              sc.nextLine();
                         }
                    }
                    if (productoEncontrado.getStock() >= opcion){
                         boolean confirmacionValida = false;
                         String confirmacionRespuesta = "";
                         while (!confirmacionValida) {
                              System.out.print("¿Desea agregar este pedido? (s/n): ");
                              confirmacionRespuesta = sc.nextLine().trim().toLowerCase();
                              if (confirmacionRespuesta.equals("s") || confirmacionRespuesta.equals("n")) {
                                   confirmacionValida = true;
                              } else {
                                   System.out.println("¡Entrada inválida! Por favor, ingrese 's' para sí o 'n' para no.");
                              }
                         }
                         if (confirmacionRespuesta.equals("s")) {
                              int idPedido = proximoPedidoDisponible;
                              Pedido nuevoPedido = new Pedido(
                                   idPedido,
                                   productoEncontrado.getId(),
                                   productoEncontrado.getNombre(),
                                   opcion,
                                   productoEncontrado.getPrecio()
                              );
                              pedidos.add(nuevoPedido);
                              proximoPedidoDisponible++;
                              productoEncontrado.setStock(productoEncontrado.getStock() - opcion);
                              costoTotal = opcion * productoEncontrado.getPrecio();
                              costoFinal += costoTotal;
                              System.out.println(nuevoPedido + " Total: $" + formatearNumero(costoTotal));
                              System.out.println("Pedido agregado correctamente.");
                              noHayProducto = true;
                         } else {
                              System.out.println("Pedido cancelado. No se agregó al sistema.");
                              noHayProducto = true;
                         }
                    } else {
                         System.out.println("Stock insuficiente. Cantidad disponible: " + productoEncontrado.getStock());
                         noHayProducto = true;
                    }
               }
               boolean respuestaValida = false;
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
               if (respuesta.equals("n")){
                    System.out.println("El pedido tiene un costo total de : $" + formatearNumero(costoFinal));
                    sc.nextLine();
               }


          } while (respuesta.equals("s"));
     }

     static void listarPedidos(ArrayList<Pedido> pedidos) {
          if (pedidos.isEmpty()) {
               System.out.println("No hay pedidos en el archivo");
               pausarParaContinuar();
               return;
          }
          System.out.println("Listado de pedidos:");
          double costoTotal;
          double costoFinal = 0;

          for (Pedido pedido : pedidos) {
               costoTotal = pedido.getCantidadPedido()*pedido.getPrecioProducto();
               System.out.println(pedido + " Total: $" + formatearNumero(costoTotal)); // Aquí llama a toString()
               costoFinal += costoTotal;
          }
          System.out.println("Costo Total: $" + formatearNumero(costoFinal));
          pausarParaContinuar();
     }


}
