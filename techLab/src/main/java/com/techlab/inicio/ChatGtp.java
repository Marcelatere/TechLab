//package com.techlab.inicio;
//
//public class ChatGtp {
//    public class Producto {
//        private int id;
//        private String nombre;
//        private double precio;
//        private int stock;
//
//        public Producto(int id, String nombre, double precio, int stock){
//            this.id = id;
//            this.nombre = nombre;
//            this.precio = precio;
//            this.stock = stock;
//        }
//
//        // Métodos get (accesores para leer valores)
//        public int getId() {
//            return id;
//        }
//
//        public String getNombre() {
//            return nombre;
//        }
//
//        public double getPrecio() {
//            return precio;
//        }
//
//        public int getStock() {
//            return stock;
//        }
//
//        // Métodos set (modificadores para cambiar valores)
//        public void setNombre(String nombre) {
//            this.nombre = nombre;
//        }
//
//        public void setPrecio(double precio) {
//            this.precio = precio;
//        }
//
//        public void setStock(int stock) {
//            this.stock = stock;
//        }
//    }
//    public class Ejemplo {
//        public static void main(String[] args) {
//            Producto producto = new Producto(1, "Manzana", 2.50, 10);
//
//            // Acceder a los atributos usando los métodos get
//            System.out.println("Nombre del producto: " + producto.getNombre());
//            System.out.println("Precio: " + producto.getPrecio());
//
//            // Modificar un atributo usando el método set
//            producto.setPrecio(2.75);
//            System.out.println("Nuevo precio: " + producto.getPrecio());
//        }
//    }
//    //Ejemplo básico con columnas alineadas:
//
//System.out.printf("%-5s %-20s %-10s %-10s\n", "ID", "Nombre", "Precio", "Stock");
//for (Producto p : productos) {
//        System.out.printf("%-5d %-20s %-10.2f %-10d\n", p.getId(), p.getNombre(), p.getPrecio(), p.getStock());
//    }
//    public static void listarProductos(ArrayList<Producto> productos) {
//        if (productos.isEmpty()) {
//            System.out.println("No hay productos en el inventario.");
//            return;
//        }
//
//        // Imprimir encabezados con formato
//        System.out.printf("%-4s %-5s %-20s %-10s %-6s\n", "N°", "ID", "Nombre", "Precio", "Stock");
//        System.out.println("----------------------------------------------------------");
//
//        int i = 1;
//        for (Producto producto : productos) {
//            System.out.printf("%-4d %-5d %-20s $%-9.2f %-6d\n", i, producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getStock());
//            i++;
//        }
//    }
//}
