/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_3;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Ejercicio_11_Test {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
 int num;
 Ejercicio_11 N = new Ejercicio_11();


 System.out.println("Programa para invertir un numero entero ");
 
 System.out.println("Digite un numero entero: ");
 num = entrada.nextInt();

 System.out.println("El numero invertido es: ");
 N.Invertir( num );

 
    }
}
