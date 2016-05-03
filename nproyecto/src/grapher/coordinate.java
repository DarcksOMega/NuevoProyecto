/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapher;

/**
 *
 * @author AULA1
 */
public class coordinate {
    
    protected int x,y;
    protected coordinate next,back; 
    
    public coordinate(int x,int y){
        
        this.x=x;
        this.y=y;
        
    }
}
