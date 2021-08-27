package Ejercicios;

import java.util.Scanner;

/**
 * @author Nico Biglia
 */
public class BuclesYRamificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Ejercicio 1 :
        //Escriba un programa que muestre en pantalla todos los números primos 
        //entre 1 y n, donde n es un número positivo que recibe el programa como parámetro.
        
        /*
        System.out.println("Ingrese el numero: ");
        int numero = entrada.nextInt(), i;
        System.out.println("Has pasado el numero: " + numero);
        System.out.println("Inicio bucle desde 2 hasta " + (numero - 1));

        for ( i = 2; i < numero; i++) {

           System.out.println("Modulo entre " + numero + " y " + i + " = " + (numero % i));

           if(numero % i == 0) {
                System.out.println(i + " es un multiplo de " + numero);
                System.out.println(numero + " no es un numero primo porque " + i + " es un multiplo");
            }

         }

        if (numero == 1) {
            System.out.println("Me has pasado el numero 1, recuerda que NO es un numero primo");
        } else {
            System.out.println("Como el numero ingresado no tuvo mas múltiplos entonces determinamos que SI es un numero primo.");
            }
        */
        
        //Ejercicio 2: 
        //Implemente un programa que calcule los divisores de un número entero ingresado por teclado.
        
        /*
        System.out.println("Ingrese el numero: ");
        int numero = entrada.nextInt() , i;
        
        for(i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.println(i+" es Divisor de "+numero);;
            }
        }
        */
        
        //Ejercicio 3:
        //Escriba un programa que lea por teclado números enteros hasta que se introduzcan 10 números o se introduzca un valor negativo.
        //El programa mostrará entonces el promedio de los números introducidos (sin contar el número negativo en caso de que éste se haya indicado).
        
        /*
        int contador = 0;
        int suma = 0;
        while(contador < 10){
            int numero;
            
            System.out.println("Ingrese un numero entero: ");
            numero = entrada.nextInt();
            if(numero < 0){
                System.out.println("Los numeros negativos no son validos");
                break;
            }else{
                suma = suma + numero;
                contador++;
            }
        }
        System.out.println("La sumatoria es: "+suma);
        float promedio = suma / contador;
        
        System.out.println("El promedio es: "+promedio);
        */
    }
}
