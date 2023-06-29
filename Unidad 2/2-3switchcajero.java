/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg3switchcajero;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        final int saldo_inicial=1000;
        int opcion;
        double ingreso, saldoActual,retiro;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("1. Ingresa dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta");
        System.out.println("3. Salir");
        
        System.out.println("Ingresa un número");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese la cantidad que desea ingresar ");
                ingreso=entrada.nextInt();
                saldoActual=saldo_inicial+ingreso;
                
                System.out.println("El estado actual es de: " + saldoActual);
                break;
            case 2: 
                System.out.println("Didite la cantidad que desea retirar");
                retiro=entrada.nextInt();
                
                if (retiro<=saldo_inicial){
                    saldoActual = saldo_inicial - retiro;
                    
                }else{
                    System.out.println("No cuenta con el");
                    break;
                }
        }
        
    }
    
}
