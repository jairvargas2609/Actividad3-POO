/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * 2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 (para
 * ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) comprendidos
 * entre 1 y n (n es determinado por el usuario). Imprimir la cantidad de
 * múltiplos de 5 y 3.
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int sumaMultiplos = 0;
        int cantMultiplos = 0;
        
        System.out.println("Escriba un numero");
        numero = leer.nextInt();
        
        for(int i = 1; i <= numero; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                sumaMultiplos = sumaMultiplos + i;
                System.out.println(i);
                cantMultiplos++;
       
             }
            
            
        }
        System.out.println("Esta es la cantidad de multiplos:" + cantMultiplos);
        System.out.println("Esta es la suma de multiplos:" + sumaMultiplos);
        
        
        
    }
    
}
