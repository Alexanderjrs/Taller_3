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
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.print("Ingrese el tamaño del cuadrado de rango(1-20): ");
        int n = teclado.nextInt();
       
        if(n >= 0 && n<=20) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("═");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("║");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("║");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("═");
            }
        }else {
            System.out.println("El Numero ingresado esta fuera de rango");
        }
    }
}
