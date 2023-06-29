
package whilecuadrado;

import java.util.Scanner;


public class WHILECUADRADO {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        
          System.out.println("Introduzca el número");
          num = entrada.nextInt();
          while (num>0){
              cuadrado = num * num;
              System.out.println("El cuadrado de " + num + "es igual a" + cuadrado);
              System.out.println("");
              System.out.println("Introduzca otro numero");
              num = entrada .nextInt();
          }
        
    }
    
}
