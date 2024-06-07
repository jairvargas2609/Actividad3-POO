
package actividad3;

/**
 *
 * 17. Generar un arreglo unidimensional de 50 posiciones que se llene con
 * valores aleatorios y contar la cantidad de positivos, negativos y ceros del
 * arreglo.
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrayAleatorio[] = new int[50];
        short contadorPositivos = 0;
        short contadorNegativos = 0;
        short contadorCeros = 0;
        for (int i = 0; i < 50; i++) {
            arrayAleatorio[i] = (int) (Math.random()*-100+100);
            if(arrayAleatorio[i]>0) contadorPositivos++;
            else if(arrayAleatorio[i]<0) contadorNegativos++;
            else contadorCeros++;
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(arrayAleatorio[i] + " ");
        }
        System.out.println("Cantidad negativos:" + contadorNegativos);
        System.out.println("Cantidad positivos:" + contadorPositivos);
        System.out.println("Cantidad ceros:" + contadorCeros);

    }
}
