
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Nico Biglia
 */
public class Sueldo {
    //Crear una clase llamada sueldo, que calcule el salario mensual de un trabajador
    //en base a su sueldo básico (deberá ser una constante), a un plus por asistencia, al valor de la hora y a la cantidad de horas trabajadas.
    //El plus por asistencia, el valor de la hora y la cantidad de horas trabajadas deberán ingresarse por teclado.
    //Modificar el código anterior para imponer un descuento fijo del 20% sobre el salario final.
    
    Scanner entrada = new Scanner(System.in);
    
    public Sueldo(){
        final int SUELDO_BASICO = 35000;
        
        System.out.println("Ingrese el valor por hora trabajada: ");
        int valorHora = entrada.nextInt();
        double plusAsistencia = SUELDO_BASICO * 0.10;
        
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int cantidadHorasTrabajadas = entrada.nextInt();
        
        double sueldoFinal = SUELDO_BASICO + (cantidadHorasTrabajadas * valorHora) + plusAsistencia;
        
        
        System.out.println("El sueldo final es: " + sueldoFinal);
        
        double descuento = sueldoFinal - (sueldoFinal * 20)/100 ;
        
        System.out.println("El sueldo con el descuento aplicado es: "+ descuento);
    }
    
    public static void main(String args[]){
        
       Sueldo empleado1 = new Sueldo();
       
       Sueldo empleado2 = new Sueldo();
        
        
    }
}
