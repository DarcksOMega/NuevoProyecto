/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleCircular;

import doublelist.list;

/**
 *
 * @author deivyponal
 */
public class Test {
    
    public static void main (String [] args){
       list l = new list();
       
       l.add(1);
       l.add(3);
       l.add(8);
       l.add(9);
       l.add(10);
       l.add(11);
       
      l.print();
      l.Push(4);
      l.print();
    
}
}