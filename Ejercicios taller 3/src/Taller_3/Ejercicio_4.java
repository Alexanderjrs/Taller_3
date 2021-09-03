/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_3;

import java.util.Scanner;


public class Ejercicio_4 {
    public static void main(String[] args) {
        
        
        int cont, acum,hem,hr,hrse,hrex,sb;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digitar cantidad de empleados: ");
        cont=sc.nextInt();
        
      
        for (int i = 0; i <cont; i++) {
            acum=+1;
            System.out.println("Cantidad de horas del empleado "+ (i+1));
            hem=sc.nextInt();
            
                System.out.println("Digitar el Precio de la hora:");
            hr=sc.nextInt();
            if (hem>40) {
            hrse=hem-40;
             hrex= (int)(float)( hrse*hr*1.5);
            
             sb= hrex+(40*hr);
             
            System.out.println("el sueldo bruto es: "+sb);
                
            }else{
            sb=hem*hr;
                System.out.println("El sueldo bruto es: "+sb);
            }
            
            
        }
        
        
    }
}
