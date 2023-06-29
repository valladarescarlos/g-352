
package pkg2.pkg10doacumulador;
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
        Scanner entrada = new Scanner(System.in);
        int num, suma;
        suma=0;
        do{
            System.out.println("Introduzca el número: ");
            num = entrada.nextInt();
            suma = suma + num;
        }while(num!=0);
        System.out.println("La suma de todo es: " + suma);
    }
    
}
