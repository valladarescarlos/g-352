/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.descdiasemana;

    import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class descdiasemana {
    static double pago, total, iva ;
    static String dia;
   
    public static void main(String[] args) {
        pedirDatos();
        compra(pago, total, iva, dia);
    }
    
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el monto de la compra:");
        total = entrada.nextInt();
        System.out.println("Escriba el dia de la compra:");
        dia = entrada.next();
        
    }
    
    public static void compra(double pago, double total, double iva, String dia){
       double res;
        String dias = dia.toLowerCase();
        if ("Martes".equals(dias) || "Jueves".equals(dias)) {
            pago = (total-(total * 0.20));
             iva = pago * 0.16;
             res = pago + iva;
             System.out.println("Felicidades!! Hoy es " + dias + " dia de descuento.");
             System.out.println(" Total a pagar es = " + res);
        }else{
            System.out.println("Hoy no es dia de descuento...");
            System.out.println("El total a pagar es: " + total);
        }
             
    }
}
