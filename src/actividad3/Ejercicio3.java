/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * 3.Hacer un programa en Java que, dado un rango, por el usuario, se da número
 * inicial y uno final (tomar en cuenta que el inicial debe ser menor que el
 * final, hacer la validación y volver a pedir los dos números si no cumple la
 * condición) y sume los números pares dentro del rango incluyendo el valor
 * inicial y final.
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int sumPares = 0;
        int total = 0;
        int numInicial;
        int numFinal;

        do {
            System.out.println("Escribe el primer numero:");
            numInicial = leer.nextInt();
            System.out.println("Escribe el segundo numero:");
            numFinal = leer.nextInt();
        } while (numInicial >= numFinal);

        for (int i = numInicial; i <= numFinal; i++) {

            if (i % 2 == 0) {
                sumPares = sumPares + i;
                System.out.println(i);

            }
           total = numInicial + sumPares + numFinal;

        }

        System.out.println("La suma total de los numeros pares entre" + " "
                + numInicial + " " + "y" + " " + numFinal + " " + "es"
                + " " + total);

    }

}
