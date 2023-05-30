/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.funcmayoredad;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class FuncMayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        Scanner entrada = new Scanner(System.in);
        int num;
        //Entrada de datos 
        System.out.println("Ingresa tu edad: ");
        num = entrada.nextInt();
        //Slida de datos
        retornaEdad(num);
        System.out.println(retornaEdad(num));
    }
    public static String retornaEdad( int num){
        //Declaración de variables
        if (num >= 18){
            System.out.println("Eres mayor de edad");
        }else if (num < 18){
            System.out.println("Eres menor de edad");
        }
        return "Según sea tu caso";
    }
}
