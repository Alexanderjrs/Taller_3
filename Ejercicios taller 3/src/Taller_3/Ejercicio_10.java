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
public class Ejercicio_10 {
    
        public void parqueadero(){
        
        Scanner sc = new Scanner(System.in);
        double Hr = 0;
        double Crg = 0;
        double Total = 0;
        int Cont = 1;
    
        System.out.println("Sistema de cobro del estacionamiento.");

        System.out.printf(" Ingresar el numero de horas de estacionamiento: %d:\n", Cont++);
        System.out.print("( 0 para culminar la ejecucion)\n");
        Hr =  sc.nextDouble();

        while ( 0 != Hr ){     

        System.out.printf("El cargo para este usuario es de: %.2f\n", Crg(Hr));
        Total += Crg(Hr);

        System.out.printf(" Ingresar el numero de horas de estacionamiento: %d:\n", Cont++);
        System.out.print("( 0 para culminar la ejecucion)\n");
        Hr =  sc.nextDouble();

        } 

        System.out.printf("El cargo total del dia es: %.2f\n", Total);

        }   



    public double Crg( double a){    

        if ( 3 >= a )
            return 2.0;

            else
                return (2 + 0.5*Math.ceil(a - 3)) <= 10? 2 + 0.5*Math.ceil(a -3) : 10; 

    }     


}
