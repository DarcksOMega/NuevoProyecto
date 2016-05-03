/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

/**
 *
 * @author AULA1
 */
public class list {
    
    private Node head;
  
   public list() {
        head = null;
     }
 
    public void add (int d){
        
        Node n = new Node (d);
        
        if(head == null){
            head=n;
        }else{
            Node aux=head;
            while(aux.next != null){
               aux=aux.next; 
            }
            aux.next=n;
            n.back= aux;
        }
    }
  
     public void print() {
          Node aux = head;
          while (aux != null) {
             System.out.print(" " + aux.data);
              aux = aux.next;
          }
         System.out.println();
  
      }
   public void ReversePrint(){
          if (head==null)return;
          Node aux = head;
         while(aux.next != null){
              aux = aux.next;
         }
          while ( aux!= null){
             System.out.print(" "+aux.data);
              aux=aux.back;
          }
      }
   
      public void Push(int d){
          Node n = new Node(d);
          if(head==null){
              head=n;
          }else{
              n.next=head;
              head.back=n;
              head=n;
         }
     
  }
      
      public int Remove(int i){
      
        Node aux = head , p= null;
    
        if(head==null){
            System.out.println("-1");
        }else if(i==0){
            head = head.next;
            
        }
        int counter = 0;
        
        for (;counter<i && aux !=null; counter++){
            p=aux;
            aux=aux.next;
        
    }
        
        if(aux != null){
            p.next= aux.next;
        }else{
           return -1;
        }
        
        
     return aux.data;   
    }
      
      public void PrintFirtsElement(){
        
        if( head != null){
            System.out.println(""+head.data);
            
        }else{
            System.out.println("-1");
        }
        
    }
      
      public void PrintLastElement(){
        
        
        if(head==null){
            System.out.println("-1");
        }else{
            
           Node aux = head;
           while(aux.next!=null){
               aux=aux.next;
           }
            System.out.println(" " + aux.data);
        }
        
    }
      
public void RemoveFirst(){
       if(head==null)return;
             
       head=head.next;
       head.back=null;
       
          
       }

public void RemoveLast(){
    
    if(head==null)return;
    Node aux= head,p=head;
    while(aux.next!=null){
        aux=aux.next;
       
        while(p.next!=aux){
            p=p.next;
        }
        
    }
  p.next=null;
  aux.back=p;
            
}

public int count (){
        
        Node aux= head;
        int counter =0;
        while(aux != null){
            counter++;
            aux = aux.next;
        }
        return counter;
    } 

public void Invert(){
    
    Node aux=head;
    
    while(aux.next!=null){
        aux=aux.next;
}
    Node last=aux;
    Node head2=aux;
    aux.next=aux.back;
    aux.back=null;
    int c=count();
    
    for(int i=1;i<c;i++){
        
    last=aux;
    aux=aux.back;
    aux.next=aux.back;
    aux.back=last;
    
}
    
    head= head2;
    
    
}

public void Duplicate (){
    
    if (head==null) return;
    
    Node aux=head,last=head;
    int c = count();
    
    while(last.next!=null){
        last=last.next;
        
    }
    
    for(int i=0; i<c; i++){
        
        Node n= new Node(aux.data);
        
        n.back=last;
        last.next=n;
        n.next=null;
        
        aux=aux.next;
        last=last.next;
        
}
        
}

public void DuplicateMirror(){
    
    if (head==null) return;
    
    Node aux=head,last=head;
   
    
    while(last.next!=null){
        last=last.next;
       
       
        
    }
    aux=last;
    
    
    while(aux!=null){
        
        Node n= new Node(aux.data);
        
        n.back=last;
        last.next=n;
        
        
        last=last.next;
        aux= aux.back;
        
        
    }
    
}
    
    public void InsertZeros(){
        
        Node aux=head,p=head;
        
        while(aux.next!=null){
            
            Node n = new Node (0);
            aux=aux.next;
            
            n.next=aux;
            aux.back=n;
            p.next=n;
            n.back=p;
            
            
             p=aux;
           
            
        }
        
    }
    
}
         

