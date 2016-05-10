/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtrees;

/**
 *
 * @author AULA1
 */
public class Node {
    
    protected int data;
    protected Node left;
    protected Node right;
    
    public Node (int d){
        
        data=d;
        left=null;
        right=null;
        
    }

    Node(Node d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
