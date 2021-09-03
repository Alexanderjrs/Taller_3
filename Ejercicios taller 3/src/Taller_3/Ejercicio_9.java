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
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        float costo;
        float total = 0;
        int numproducto;
        int venta;
    
        System.out.print("\nEste almacen vende cinco productos con los siguientes");
        System.out.println("\nprecios:");
        System.out.println("\nProducto 1: $2.98");
        System.out.println("\nProducto 2: $4.50");
        System.out.println("\nProducto 3: $9.98");
        System.out.println("\nProducto 4: $4.49");
        System.out.println("\nProducto 5: $6.87\n");

        System.out.println("\nPor favor introduzca el numero del primer producto:");
        System.out.println("( 0 para terminar).");
        numproducto = entrada.nextInt(); 

        while ( 0 != numproducto )
        {       

        switch ( numproducto )
        {   

        case 1 ->   {   

        System.out.print("\nIntroduzca la cantidad vendida :");
        venta = entrada.nextInt();
        System.out.printf("\nPrecio de esta venta: %f", venta*2.98);
        total += venta*2.98;
        }
        case 2 ->   {  

        System.out.print("\nIntroduzca la cantidad vendida :");
       venta = entrada.nextInt();
        System.out.printf("\nPrecio :$ %f", venta*4.50);
        total += venta*4.50;
        }  
        case 3 ->   {   

        System.out.print("\nIntroduzca la cantidad vendida :");
        venta = entrada.nextInt();
        System.out.printf("\nPrecio :$ %f", venta*9.98);
        total += venta*9.98;
        }  

        case 4 ->   {    

        System.out.print("\nIntroduzca la cantidad vendida :");
        venta = entrada.nextInt();
        System.out.printf("\nPrecio :$ %f", venta*4.49);
        total += venta*4.49;
        }  
        case 5 ->   {    

        System.out.print("\nIntroduzca la cantidad vendida :");
        venta = entrada.nextInt();
        System.out.printf("\nPrecio :$ %f", venta*6.87);
        total += venta*6.87;
        }  

        default ->   {    

        System.out.print("\nDigite una opcion correcta");
        }  

        }
                  
                  

        System.out.println("\n Digite el numero del siguiente producto:");
        System.out.println("( 0 para terminar).");
        numproducto = entrada.nextInt(); 


        }       

        System.out.printf("\n El total de ventas fue:$ %f\n\n", total);
    }
}
