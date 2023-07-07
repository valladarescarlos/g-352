
package pkg3.pkg2sueldos;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int sumaSueldos, sueldo, mayor1000, sueldoMax, sueldoMin;
        double mediaSueldo;
        boolean ban= true;
        boolean ban2 = true;
        //Inicializacion de variables
        sumaSueldos=0; mayor1000=0; sueldoMax=0; sueldoMin=0;
        mediaSueldo=0;
        
        //Iniciamos el ciclo for
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresa el sueldo "+i);
            sueldo = entrada.nextInt();
            
            //Sueldos mayor de 1000
            if (sueldo > 1000) {
                mayor1000++;
            }
            sumaSueldos = sumaSueldos + sueldo;
            
            //sueldo maximo
            if (ban==true) {
                sueldoMax=sueldo;
                ban=false;//se cierra la bandera
            }else if (sueldo>sueldoMax) {
                sueldoMax= sueldo;
            }
            
            //sueldo minimo
            if (ban2==true) {
                sueldoMin=sueldo;
                ban2=false;//se cierra la bandera
            }else if (sueldo<sueldoMin) {
                sueldoMin= sueldo;
            }
        }
        //fin del ciclo for
        mediaSueldo = sumaSueldos/10;
        
        //Impresion de resultados
        System.out.println("La suma de los sueldos es: $ "+sumaSueldos);
        System.out.println("Los sueldos mayores a 1000 fueron: "+mayor1000);
        System.out.println("La media de sueldos es: $ "+mediaSueldo);
        System.out.println("El sueldo maximo es: $ "+sueldoMax);
        System.out.println("El sueldo minimo es : $ "+sueldoMin);
    }
}
