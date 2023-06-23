/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg1calificaciones;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Declaración de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        int calificacion;
        calificacion = entrada.nextInt();
        
        //Proceso
        switch (calificacion) {
            
            case 0:
                System.out.println("Muy Mala");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Insuficiente");
                break;
            case 6:
                System.out.println("Suficiente");
                break;
            case 7:
                System.out.println("Aprobado");
                break;
            case 8:
                System.out.println("Bien");
               break;
            case 9:
                System.out.println("Bueno");
                break;
            case 10:
                System.out.println("Exelente");
                break;
            default:
                System.out.println("Calificación no válida");
                break;
        }
        
    }
    
}
    
