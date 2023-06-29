/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilemedia;

import java.util.Scanner;

public class WHILEMEDIA {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma, elementos;
        double media;
        
        System.out.println("Busca un numero: ");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while(num>=0){
            suma+= num;
            elementos++;
            
              System.out.println("Introduzca otro número");
              num = entrada.nextInt();
              
                  System.out.println("No se puede hacer el promedio");
        }
          media = (float)suma/elementos;
          System.out.println("La media es de: " + media);

        
        
        
    }
    
}
