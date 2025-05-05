
package encontrarnumeromayorymenor;

import java.util.Scanner;
public class ENCONTRARNUMEROMAYORYMENOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        
        System.out.println("Por favor, ingresa 8 números enteros:");

        // Leer los 8 números desde el teclado
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar el mayor y menor con el primer elemento del array
        int mayor = numeros[0];
        int menor = numeros[0];

        // Determinar el número mayor y menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar los resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
    
    

