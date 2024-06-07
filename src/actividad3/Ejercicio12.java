/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

/**
 *
 * 12. Realizar un programa que genere una matriz 5x5, 
 * inicializarla en 2 e imprimirla.
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int matriz5x5[][] = new int[5][5];

        for (int i = 0; i < matriz5x5.length; i++) {
            for (int j = 0; j < matriz5x5[i].length; j++) {

                matriz5x5[i][j] = 2;
            }

        }
        System.out.println("Matriz 5x5 inicializada en 2:");
        for (int i = 0; i < matriz5x5.length; i++) {
            for (int j = 0; j < matriz5x5[i].length; j++) {
                System.out.print(matriz5x5[i][j] + " ");
            }
            System.out.println();
        }

    }

}
