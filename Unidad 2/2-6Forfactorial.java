
package forfactorial;
import java.util.Scanner;

public class Forfactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("Introduce un número");
        num = entrada.nextInt();
        factorial=1;
        for (int i = num; i > 0; i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial de " + num + "es: " + factorial);
    }
    
}
