/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg2codigodescuento;
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
        // declaración de variables.
        Scanner scanner = new Scanner(System.in);
                // Obtener el precio del producto.
        
        System.out.println("Introduzca el precio del producto:");
        String precio = scanner.nextLine();
        
        // Obtener el código de descuento del usuario.
        
        System.out.println("Introduzca el descuento:");
        String códigodescuento = scanner.nextLine();
        
       // proceso.
        double descuento = 0;
        switch (códigodescuento) {
            case "10":
                descuento = 10;
                break;
            case "20":
                descuento = 20;
                break;
            case "30":
                descuento = 30;
                break;
            case "40":
                descuento = 40;
                break;
            case "50":
                descuento = 50;
                break;  
            case "60":
                descuento = 60;
                break;
            case "70":
                descuento = 70;
                break;
            case "80":
                descuento = 80;
                break;
            case "90":
                descuento = 90;
                break;
            case "100":
                descuento = 100;
                break;
            default:
                System.out.println("no existe descuento");
        }
        // resultado.
        System.out.println("su descuento es del: " + descuento + "%. Bonita Tarde");
    }
}
    
    

