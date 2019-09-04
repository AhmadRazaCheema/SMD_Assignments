package smdas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l164395
 */
 public abstract class Shape {
    public static int totalCount=0;

    public Shape() {
       totalCount++;
    }
   public void print(){
       System.out.println("Total count: " +totalCount );
   }
    public abstract double area();
    public abstract double perimeter();
}

