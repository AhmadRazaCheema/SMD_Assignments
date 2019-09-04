/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smdas;

/**
 *
 * @author l164395
 */
public class Player {

  static double x=5, y=3, z=4;
  static double area()
  {
      double s = (x + y + z) / 2;
       return Math.sqrt(s * (s - x) * (s - y) * (s - z));
  }
   static public class Line {
         void display() 
        { 
            
            System.out.println("x = " + x + "y = " + y + "z = " + z ); 
            System.out.println("Print Area = " + Player.area()); 
        } 
      
     
   } 
   
} 
