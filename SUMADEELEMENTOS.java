
package sumadeelementos;

import java.util.Scanner;
public class SUMADEELEMENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Por favor, ingresa 5 números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
    
    

