package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Users\\maria\\OneDrive\\DOCUMENTOS MARIANO\\B-JAVA UTN\\Clase5\\Clase5_Ej1\\Productos.txt";
        Producto[] ListaProducto = new Producto[Files.readAllLines(Paths.get(ruta)).size()];

        int i = 0;
        for(String linea : Files.readAllLines(Paths.get(ruta))) {
            String[] lectura = linea.split(",");
            ListaProducto[i] = new Producto(lectura[2],Double.parseDouble(lectura[1]),Integer.parseInt(lectura[0]));
            i++;
        }

        Carrito CarritoUno = new Carrito();

        for(int j = 0;j < ListaProducto.length; j++){
            CarritoUno.agregarProducto(ListaProducto[j]);
        }

        System.out.println(CarritoUno.precio());
    }
}