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
public class Ejercicio_6 {
    public static void main(String[] args) {
         int num, cifra, res=0, exp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite un numero Binario (0 y 1):");
        num=sc.nextInt();
        do{
            cifra=num%10;
            res=res+cifra*(int)Math.pow(2, exp);
            exp++;
            num=num/10;
        }while(num>0);
        System.out.println("su numero convertido a decimal es: "+ res);
    }
}
