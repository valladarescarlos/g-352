
package pkg2.pkg5whilefordo;

public class WHILEFORDO {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Números del 1 al 100");
        int i=1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
        
        System.out.println("Numeros del 1 al 100 con DO");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=100);
        
        System.out.println("Numeros del 1 al 100 con for");
        for(int k=1; k<=100; k++){
            System.out.println(k);
        }
    }
    
    
}
