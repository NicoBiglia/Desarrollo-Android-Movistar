
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Nicolás Biglia
 */
public class OperadoresYControl {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Ejercicio 1:
        //¿Cuál es el resultado de evaluar las siguientes expresiones si suponemos que, inicialmente, x vale 1?
        //Resolverlo usando código, programando en Java cada uno de los puntos.
        
        /*
        System.out.println("Cual sera el valor de X?: ");
        int x = entrada.nextInt();
        
        boolean ejercicio1 =  (x > 1) & (x++ < 10) ;
       
        System.out.println("La primer operacion es: "+ejercicio1);
        
        boolean ejercicio2 = (1 > x) && ( 1 > x++) ;
        
        System.out.println("La segunda operacion es: "+ejercicio2);
        
        boolean ejercicio3 = (1 == x) | (10 > x++);
        
        System.out.println("La tercer operacion es: "+ejercicio3);
        
        boolean ejercicio4 = (1 == x) || (10 > x++);
        
        System.out.println("La cuarta operacion es: "+ejercicio4);
        
        int ejercicio5 = (++x) + x;
        
        System.out.println("La quinta operacion es: "+ ejercicio5);
        
        int ejercicio6 = x + (++x);
        
        System.out.println("La sexta operacion es: "+ ejercicio6);
        */
        
        
        //Ejercicio 2 :
        //Dada una medida de tiempo expresada en horas, minutos y segundos con valores arbitrarios, 
        //elabore un programa que transforme dicha medida en una expresión correcta.
        //Por ejemplo, dada la medida 3h 118m 195s, el programa deberá obtener como resultado 5h 1m 15s.

        /*
        int horas, minutos, segundos;
        
        System.out.println("Ingrese la cantidad de horas: ");
        horas = entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de segundos: ");
        segundos = entrada.nextInt();
        
        if(segundos >= 60){
            minutos += segundos / 60;
            segundos = segundos % 60;
        }
        if(minutos >= 60){
            horas += minutos / 60;
            minutos = minutos % 60;
        }
        
        System.out.println(horas + "hs " + minutos + "m " + segundos + "s");
        */
        
        
        
        
        //Ejercicio 3 :
        //Codificar en Java el algoritmo del ejercicio 1 del TP final del módulo 1.
        
        /*
        System.out.println("Cuanto vale N? ");
        int N = entrada.nextInt(), S = 0, P = 1;
        
        while(N != 0 ){
            if(N % 2 == 0){
                P = P * N;
                N = N - 1;
            }
            if(N % 2 == 1){
                S = S + N;
                N = N - 1;
            }
            
        }
        System.out.println(P - S);
        */
    }
}
