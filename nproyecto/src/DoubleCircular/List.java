/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleCircular;

/**
 *
 * @author deivyponal
 */
public class List {
    
    private Node head;
    
    public List(){
        head=null;
    }
    
    public void Push(int d){
        
        Node n = new Node (d);
        
        n.next=head.next;
        n.back=head.back;
        head.next.back=n;
        head.back.next=n;
        
        
    }
    
    public void add(int d){
                   
        Node aux=head,p=head;
        Node n = new Node (d);
        
        if(head==null){
            head=n;
        }else{
                      
          do{ 
              
            p=aux;
            aux=aux.next;
          }  while(aux!=head);
               
                            
          n.next=p;
          p.next=n;
          n.back=p;
          p.back=n;
        }
               
      
    }
    
    
}
