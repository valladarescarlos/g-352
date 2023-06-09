/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.determinaetapas;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class Edad {
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese su edad: ");
int edad = scanner.nextInt();
if (edad < 5) {
System.out.println("Es un infante.");
} else if (edad < 18) {
System.out.println("Es un niño.");
} else {
System.out.println("Es un adulto.");
}
}
}
