
package pkg3.pkg1edadesyalturas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declarar variables
        Scanner entrada = new Scanner(System.in);
        int edad, media_edad, suma_edad, mayor_edad, mayor_175;
        double altura, media_altura, suma_altura;
        // Inicializar variables
        mayor_edad=0; media_altura=0; mayor_175=0; suma_edad=0; suma_altura=0;
        
        //Proceso
        for (int i = 1; i <= 5; i++){
            System.out.println("*******************************************");
            System.out.println("* Alumno no. "+i+"                        *");
            System.out.println("* Introduzca la edad:                     *");
            edad=entrada.nextInt();
            System.out.println("* Introduce la altura:                    *");
            altura=entrada.nextDouble();
            if (edad>=18) {
                mayor_edad++;
            }
            if (altura>1.75) {
                mayor_175++;
            }
            suma_edad=suma_edad+edad;
            suma_altura=suma_altura+altura;
            // Termina ciclo for
        }
        media_edad=suma_edad/5;
        media_altura=suma_altura/5;
        // Salida de datos
        System.out.println("* La edad media es de: " + media_edad + "      *");
        System.out.println("* La altura media es de: " + media_altura + "  *");
        System.out.println("* Cantidad > a 18: " + mayor_edad + "          *");
        System.out.println("* Cantidad > a 1.75: " + mayor_175 +  "        *");
        
    }
    
}
