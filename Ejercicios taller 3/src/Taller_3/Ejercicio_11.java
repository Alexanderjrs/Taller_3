/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_3;

/**
 *
 * @author acer
 */
public class Ejercicio_11 {
    public int Cuenta( int a ){
  
 int div = 1;
 int cont = 0; 
 int dig = 1;

 while ( 0 != dig )
 {      
  
 dig = a / div;
 div *= 10;
 cont++;

 }      

 return --cont;

 }      



 public void Invertir (int a )  {         
 
 int digs = Cuenta(a);

 for (int i = 1; i < digs; i++)
 {       
 System.out.printf("\t%d", a % 10);     
 a /= 10;
          
 }       

 System.out.printf("\t%3d", a);
 System.out.println("\n");

 }         
}
