
package invertirelementos;

import java.util.Scanner;
public class INVERTIRELEMENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        // Leer 6 números enteros desde el teclado
        System.out.println("Introduce 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Invertir el orden de los elementos del array
        int[] numerosInvertidos = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosInvertidos[i] = numeros[5 - i];
        }

        // Mostrar el array invertido en la consola
        System.out.println("Array invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numerosInvertidos[i] + " ");
        }
    }
}
    
    

