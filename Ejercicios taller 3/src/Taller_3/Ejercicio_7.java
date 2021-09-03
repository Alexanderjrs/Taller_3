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
public class Ejercicio_7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Digitar cantidad de numeros: ");
        int contador=sc.nextInt();
        
        int mayor=0;
        
        for (int i = 0; i < contador; i++) {
            System.out.println("ingrese el numero "+(i+1));
            int n=sc.nextInt();
            
            if(i==0){
                mayor=n;
                
            }else if(n>mayor){
            mayor=n;
            }
        }
        System.out.println("El Mayor es: "+ mayor);
    }
}
