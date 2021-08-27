
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Nico Biglia
 */
public class Empanadas {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        final int COSTO_UNITARIO = 90;
        
        
        System.out.println("Bienvenido, el costo unitario de las empanadas es de: "+COSTO_UNITARIO);
        System.out.println("Cuantas empanadas quiere llevar? ");
        cantidad = entrada.nextInt();
        
        double costoTotal = COSTO_UNITARIO * cantidad;
        System.out.println("Excelente, usted debe abonar: "+costoTotal);
    }
}
