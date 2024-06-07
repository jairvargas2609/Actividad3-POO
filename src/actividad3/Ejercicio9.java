/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * 9. Leer N cantidad de notas (validar rango de notas), imprimir el promedio de
 * las notas, la nota más alta y la más baja.
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Definicion de variables
        double cantNotas;
        double notBaja = 0;
        double notAlta = 0;
        double notas;
        //double rangNotas = 0;
        double totalNotas = 0;
        double proNotas;

        System.out.println("ingrese la cantidad de notas");
        cantNotas = leer.nextDouble();
        //Bucle
        for (int i = 1; i <= cantNotas; i++) {
            System.out.println("Ingrese una nota" + i + ":");
            notas = leer.nextDouble();
            //Actualizacion de variables
           
            notBaja = Math.min(notBaja, notas);
            notAlta = Math.max(notAlta, notas);
            totalNotas = totalNotas + notas;
        }

        proNotas = totalNotas / cantNotas;

        System.out.println("La nota mas baja es:"
                + notBaja);
        System.out.println("La nota mas alta es:"
                + notAlta);
        System.out.println("El promedio de las notas es:"
                + proNotas);
    }

}
