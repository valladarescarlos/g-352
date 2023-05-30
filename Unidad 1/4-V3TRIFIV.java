/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3trifiv;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class V3TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        Scanner entrada = new Scanner(System.in);
        int numero;
        //Entrada de datos
        System.out.println("Dame el número: ");
        numero = entrada.nextInt();
        //Salida de datos
        retornaMultiplo(numero);
        System.out.println(retornaMultiplo(numero));
    }
    public  static String retornaMultiplo( int num){
       //Declaración de variables
        int mult3;
        int mult5;
        //Procesamiento de datos
        mult3 = num % 3;
        mult5 = num % 5;
        //Salida de datos 
        if( mult3 == 0 && mult5 == 0){
            return "TRIFIV";
        }else if (mult3==0){
            return "TRI";
        }else if (mult5==0){
            return "FIV";
        }
        return "Ningún caso";
    }
}
