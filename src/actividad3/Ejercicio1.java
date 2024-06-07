
package actividad3;

import java.util.Scanner;

/**
 *
 * 1. Hacer un programa en Java que sume los siguientes 25 impares que le siguen 
 * al número n (n es determinado por el usuario). Imprimir los 25 impares y la 
 * suma.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.Declaracion de variables
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int acumuladorImpares = 0;
        int contadorImpares = 0;
        
        System.out.println("Escribe un numero");
        numero = leer.nextInt();
        
        while(contadorImpares < 25) {
            numero++;
            if(numero % 2 != 0){
                acumuladorImpares = acumuladorImpares + numero;
                System.out.println(numero+" ");
                contadorImpares++;
            }
            System.out.println("");
        }
        
            System.out.println("Suma:"+ acumuladorImpares);
        
                
    }
    
}
