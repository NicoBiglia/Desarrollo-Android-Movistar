
package Ejercicios;

import java.util.Scanner;


public class Cadenas {
    public static void main(String[] args) {
        //Este es simplemente un ejercicio de practica, no evaluado
        
        //Las Cadenas son objetos Instanciados de la Clase String 
        String cadena1 = new String ("Hola soy la cadena 1");
        String cadena2 = "Soy la cadena 2 ";
        
        //La característica más importante de la clase String es que es
        //inmutable, esto quiere decir que no se puede cambiar el contenido,
        //cada vez que asignamos un valor diferente a una referencia a cadena,
        //se esta creando un objeto cadena nuevo, con un nuevo contenido.
        
        if(cadena1.equals(cadena2)){ // .equals() sirve para comparar Strings. Retorna true si la cadena que invoca contiene los mismos caracteres que <cadena>.
                                     //  El operador == no compara los caracteres. compara si las dos referencias referencian al mismo objeto
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son distintas");
        }
        
        int tamañoCadena = cadena1.length();   //Obtiene la longitud de la Cadena.
        System.out.println("El tamaño de la cadena 1 es "+tamañoCadena);
        
        String cadenita = cadena2.substring(5, 12); //Devuelve un nuevo String que contiene todos los caracteres del String que invoca desde el índice
                                                    //<inicio_índice> hasta <fin índice>, sin incluir este.
        System.out.println("La cadenita es "+cadenita);
        
        
        String cadenota = cadenita.toUpperCase(); //Devuelve un nuevo String que tiene todos los caracteres del que invoca pero en mayúsculas.
        System.out.println(cadenota);
        
        String cadenaNumeros = String.valueOf(12312_12-123.21312);
        System.out.println(cadenaNumeros);
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("Teclea dos palabras: ");
            String palabras = teclado.nextLine();
            System.out.println(palabras);
            System.out.println(palabras.toUpperCase());
            palabras = palabras.toLowerCase();
            System.out.println(palabras);
            palabras= " "+palabras;
            System.out.println(palabras);
            palabras = palabras.trim();
            System.out.println(palabras);
            String str1 = palabras.substring(4, 9);
            System.out.println(str1);
            long num = 9_876_543_211L;
            String str2= String.valueOf(num);
            System.out.println(str2);
            str2= str2.replace("1", "0"); //Cambia los unos por ceros
            System.out.println(str2);
            teclado.close();
    }
}
