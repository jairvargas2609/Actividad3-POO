package actividad3;

/**
 *
 * @author JAIR - PC
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz7x7[][] = new int[7][7];

        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7[i].length; j++) {
                matriz7x7[i][j] = -1;
            }
        }

        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7[i].length; j++) {
                matriz7x7[i][i] = 0;
            }
        }
        //Imprimir la matriz
        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7[i].length; j++) {
                if (matriz7x7[i][j] == -1) {
                    System.out.print("-");
                } else {
                    System.out.print(matriz7x7[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
