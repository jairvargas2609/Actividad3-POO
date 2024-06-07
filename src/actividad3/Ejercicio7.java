/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * 7. Realizar un programa en Java que dado n cantidad de números determine si
 * es primo o no y si ese número primo es múltiplo de 3, se debe contar.
 * Imprimir cantidad de primos y cantidad de múltiplos de 3
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int numero;
        int cantPrimos = 0;
        int cantMultiplos = 0;

        System.out.println("Dame un numero");
        numero = leer.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
                cantPrimos++;
            }
        }
            for(int j = 1; j <= numero; j++){
                    if(j % 3 == 0) {
                        System.out.println(j);
                        cantMultiplos++;
                       

                    }

                }

            

            System.out.println("La cantidad de primos es:" + cantPrimos);
            System.out.println("La cantidad de multiplos de 3 es:"
                    + cantMultiplos);

        }

    }

