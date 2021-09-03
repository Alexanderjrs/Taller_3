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
public class Ejercicio_2 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        int Saldo, Abonos, Cargos, Limite;
        System.out.println("Digite el saldo inicial: ");
        Saldo = entrada.nextInt();
        
        System.out.println("Digite lo que desea abonar ");
        Abonos = entrada.nextInt();
        
        System.out.println("Digite los Cargos del cliente: ");
        Cargos = entrada.nextInt();
        
        System.out.println("Digite el limite del credito: ");
        Limite = entrada.nextInt();
        
        int Credito = Saldo + Abonos - Cargos;
        int Total =  Limite - Credito;
        
        if( Credito < Limite ) {
            System.out.println( "El Saldo  favor es de: " + Total);
            
        } else {
            System.out.println("Se excedio el limite de su credito");
        }
    }
   
}
