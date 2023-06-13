/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.tipoclima;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
    
import java.util.Scanner;

public class TipoClima {

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
      
        System.out.println("Introduzca la temperatura en Celsius: ");
        int temperatura = input.nextInt();
        
        if (temperatura <= 10 ) {
            System.out.println("El clima es frío.");
        } else if (temperatura <= 20) {
            System.out.println("El clima es nublado.");
        } else if (temperatura <= 30) {
            System.out.println("El clima es caluroso.");
        } else if (temperatura > 30) {
            System.out.println("El clima es tropical.");
        } 
        }
        
    }
