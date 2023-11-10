/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19p1taller1riscokennet;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.print("Universidad de las fuerzas armadas ESPE\n");
       System.out.print("***************************************\n");
       System.out.print("Nombre: Kennet Risco\n");
       System.out.print("Materia: Programacion orientada a objetos\n");
       System.out.print("Fecha: 10/11/2023\n");
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese el primer numero: ");
       int numero1 = scanner.nextInt();
       System.out.print("Ingrese el segundo numero: ");
       int numero2 = scanner.nextInt();
       int suma = numero1+numero2;
       int multiplicacion = numero1*numero2;
       int resta = numero1-numero2;
       double division = numero1/numero2;
       System.out.println("La suma de: " + numero1 + " y " + numero2 + " es: " + suma);
       System.out.println("La resta de: " + numero1 + " y " + numero2 + " es: " + resta);
       System.out.println("La multiplicacion de: " + numero1 + " y " + numero2 + " es: " + multiplicacion);
       System.out.println("La division de: " + numero1 + " y " + numero2 + " es: " + division);
    }
    
}
