/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

import java.util.Scanner;

/**
 *
 *8. Dado N cantidad de precios de gaseosas en un supermercado el gerente 
 * de ventas desea que se genere un programa que le permita saber cuál de las 
 * gaseosas tiene el mayor precio, cuál tiene menor precio y cuál es el precio 
 * promedio. Hacer las impresiones según lo requerido
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in);

        double cantPrecios;
        double minPrecio = 0;
        double mayPrecio = 0;
        double precio;
        double totalPrecio = 0;
        double proPrecio;

        System.out.println("ingrese la cantidad de precios de gaseosas");
        cantPrecios = leer.nextDouble();

        for (int i = 1; i <= cantPrecios; i++) {
            System.out.println("Ingrese un precio" + i + ":");
            precio = leer.nextDouble();

            minPrecio = Math.min(minPrecio, precio);
            mayPrecio = Math.max(mayPrecio, precio);
            totalPrecio = totalPrecio + precio;
        }

        proPrecio = totalPrecio / cantPrecios;

        System.out.println("El mayor precio de una de las gaseosas es:" 
                + minPrecio);
        System.out.println("El mayor precio de una de las gaseosas es:" 
                + mayPrecio);
        System.out.println("El promedio del precio de las gaseosas es:" 
                + proPrecio);
    }

}
    
    

