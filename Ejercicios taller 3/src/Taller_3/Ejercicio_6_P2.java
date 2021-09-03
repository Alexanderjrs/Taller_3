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
public class Ejercicio_6_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal, modulo, aux;
        String bin="";
        System.out.println("Digite un numero Decimal");
        decimal=sc.nextInt();
        aux=decimal;
        
        while(decimal > 0){
            modulo = (decimal%2);
            bin = modulo + bin;
            decimal = decimal/2;
            
        }
        System.out.println("su numero convertido en binario es: "+ bin);
    }
}
