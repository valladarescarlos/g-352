/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.cifrasnumeros;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class Cifrasnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       pedirDato();
       procedimiento(numero);
    }
    
    public static void pedirDato(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero a evaluar:");
        numero = entrada.nextInt();
    }
    public static void procedimiento(int numero){
        if (numero<10) {
            System.out.println("Es de una cifra");
        }else if (numero<100) {
            System.out.println("Es de 2 cifras");
        }else if (numero<1000) {
            System.out.println("es de 3 cifras");
        }else if (numero<10000) {
            System.out.println("Es de 4 cifras");
        }else if (numero<100000) {
            System.out.println("Es de 5 cifras");
        }else if(numero<0){
            System.out.println("No existen numeros menores a 0");
        }
    }
    
}
