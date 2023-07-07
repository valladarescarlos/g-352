
package pkg3.pkg3facturas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
         
        // Declaración de variables
        int factura, codigo, litros, total, factuTotal, mayor10000, max, min, tl1, tl2, tl3;
        boolean ban , ban2;
        
        //Inicialización de variables
        litros = 0; total = 0; codigo=0; factuTotal=0; tl1=0; tl2=0; tl3=0;  mayor10000=0; max=0; min=0; ban=true; ban2=true;
        
        //Presentacion de produtos
        System.out.println("Bienvenido a la tienda");
        System.out.println("__________________________________");
        System.out.println("Productos: ");
        System.out.println("Desinfectante 1: $40 | codigo: 001");
        System.out.println("Desinfectante 2: $60 | codigo: 002 ");
        System.out.println("Desinfectante 3: $90 | codigo: 003");
        System.out.println("__________________________________");
        
        
        // Proceso
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el codigo del producto a comprar: ");
            codigo = en.nextInt();
            System.out.println("Ingrese la cantidad de litros");
            litros = en.nextInt();
            System.out.println("procesando...");
            System.out.println("----------------------------");
            System.out.println("| No. de factura: 0000"+i+" |");
            
            //Iniciamos switch para identificar productos
            switch (codigo) {
                case 001:
                    System.out.println("| Codigo del producto: 001 |");
                    System.out.println("| Precio por litro: $40 |");   
                    System.out.println("| Cantidad de litros comprados: "+litros+" |");
                    total = 40*litros;
                    System.out.println("| Total de compra: $"+total+" |");
                    tl1=tl1+litros;
                    break;
                case 002:
                    System.out.println("| Codigo del producto: 002 |");
                    System.out.println("| Precio por litro: $60 |");
                    System.out.println("| Cantidad de litros comprados: "+litros+" |");
                    total = 60*litros;
                    System.out.println("| Total de compra: $"+total+" |");
                    tl2= tl2+litros;
                    break;
                case 003:
                    System.out.println("| Codigo del producto: 003 |");
                    System.out.println("| Precio por litro: $90 |");
                    System.out.println("| Cantidad de litros comprados: "+litros+" |");
                    total = 90*litros;
                    System.out.println("| Total de compra: $"+total+" |");
                    tl3= tl3+litros;
                    break;
                default:
                    System.out.println("Error");
            }//fin del switch
            
            
            //Total vendido
            factuTotal = factuTotal+total;
            //compras mayores a 10000
            if (total>10000) {
                mayor10000++;
            }
            //Contador de factura maxima
            if (ban==true) {
                max = total;
                ban = false;
            }else if (total>max) {
                max=total;
            }
            //Contador de factura minima
            if (ban2==true) {
                min = total;
                ban2 = false;
            }else if (total<min) {
                min=total;
            }
            
            System.out.println("----------------------------");
            System.out.println("  ");
        }//fin del ciclo for
        
        // Resultado 
        System.out.println("     ");
        System.out.println("Factura Total: $"+factuTotal);
        System.out.println("Litros vendidos del producto 1: "+tl1+" L");
        System.out.println("Litros vendidos del producto 2: "+tl2+" L");
        System.out.println("Litros vendidos del producto 3: "+tl3+" L");
        System.out.println("Facturas mayores a 10,000: "+mayor10000+" compras");
        System.out.println("El valor maximo de las facturas es: $"+max);
        System.out.println("El valor minimo de las facturas es: $"+min);
    }
    
    
}
