package Ejercicios;

import java.util.Scanner;


public class EjercicioSintaxis01 {
    public static void main(String args[]){
        //Ejercicio simplemente para probar los tipos de datos
        
        Scanner entrada = new Scanner(System.in);
        int entero1, entero2;
        float flotante1, suma, operacion;
        String palabra1, palabra2;
        
        System.out.println("Bienvenido, ingrese los siguientes datos: ");
        System.out.println("Primero 2 enteros");
        entero1 = entrada.nextInt();
        entero2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ahora un flotante");
        flotante1 = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("Ahora dos Strings");
        palabra1 = entrada.nextLine();
        palabra2 = entrada.nextLine();
        entrada.nextLine();
        suma = entero1 + entero2 + flotante1;
        operacion = (entero1 / entero2)/ flotante1;
        
        System.out.println("Perfecto, a continuacion tendra la suma de los tres numeros: "+ suma);
        if(entero1 > entero2){
            System.out.println("El Entero 1 es mayor");
        }
        if(entero2 > entero1){
            System.out.println("El entero 2 es mayor");
        }
        System.out.println("El resultado de la division del flotante con el resto de la division de los dos enteros es: " + operacion);
        System.out.println("Estos son tus strings concatenados: "+palabra1+ " "+ palabra2);
    }
}
