/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.banderacalificacion;
import java.util.Scanner;
public class BanderaCalificacion {

    
    public static void main(String[] args) {
        
         Scanner Scanner = new Scanner(System.in);
       
         int cali= 7;
         int calif = 10;
         
         boolean cal1;

         System.out.println("Ingresa tu calificacaión: ");
         cali = Scanner.nextInt();
         cal1 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal1);
         
         System.out.println("");
         
         boolean cal2;
         
         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
         cal2 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal2);
         
         System.out.println(" ");
         
         boolean cal3;

         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
         cal3 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal3);
         
         System.out.println(" ");
         
         boolean cal4;

         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
          cal4 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal4);
         
         System.out.println(" ");
         
         boolean cal5;
         
         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
         cal5 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado:" + cal5);
        
    }
    
}
