package org.example;

public class Carrito {
    private Producto productos[] = new Producto[3];

    public void agregarProducto(Producto producto){
        int n = tieneLugar();
        if(n<3){
            productos[n]=producto;
        } else System.out.println("El Carrito esta lleno");
    }

    private int tieneLugar(){//privado pq no necesito uasarlo desde otra clase
        int indice = 3;
        int i = 0;
        for(i=0; i<productos.length; i++)
            if (productos[i] == null) {
                indice = i;
                i = 3;
            }
        return indice;
    }
    private int cantidadProductos(){
        int cant = 0;
        for(int i=0; i<productos.length; i++){
            if (productos[i] != null)
                cant++;
        }
        return cant;
    }
    public Double precio(){
        Double suma = 0.0;
        for(int i=0; i<cantidadProductos(); i++){
            suma = suma + productos[i].getPrecioTotal();}
        return suma;
    }
}
