/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.simplestructures;

/**
 *
 * @author AULA1
 */
public class List {
    
    private Node head;
    
    public List(){
        head=null;
        
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
        }
    }
    public void Print (){
        
       Node aux = head;
       while (aux != null){
           System.out.print(" "+aux.data);
           aux=aux.next;
       }
        System.out.println("");
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
    
    public void RemoveLastElement(){
        
        Node aux = head, p=null;
        while (aux.next!= null){
            p=aux;
            aux=aux.next;
        }
        p.next=null;
    }
        
    public void RemoveFirstElement(){
        
        if(head==null){
            System.out.println("-1");
        }else{
           
           Node aux = head;
           head=aux.next;
   
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
    
    public void Duplicate(){
        if(head==null) return;
        
        Node last=head,aux=head;
        while(last.next!=null){
            last= last.next;
        }
        
        int c = count();
        for(int i=0;i<c;i++){
            last.next=new Node(aux.data);
            aux=aux.next;
            last=last.next;
        }
               
            
        
        
    }
    
    public void DuplicateMirror(){
        
        int cont=0;
        Node aux=head,last=head;
        while(last.next!=null){
            last=last.next;
            cont++;
            
        }
        
        for(int i=0; i<cont; i++){
            Node n=new Node (aux.data);
            n.next=last.next;
            last.next=n;
            aux=aux.next;
        }
    }
    
    public void InsertZeros(){
        if(head==null) return;
        
        Node aux = head,p=head;
                                   
        while(aux.next != null){
            
            
            Node n = new Node(0);
            aux=aux.next;
             p.next=n;
             n.next=aux;
             p=aux;
          
        }
        
    }
    
    public void RemoveMiddle(){
        
        Node aux=head, p = head;
        int c = count();
        int m = c/2;
        
            
        if(c%2==0){
           
            for(int i=0;i<m-1;i++){
              p=aux;
              aux=aux.next;
                
            
        }
          p.next=aux.next;       
   
     }else if(c%2==1){
        
        for(int j=0; j<m+1;j++)
            p=aux;
        aux=aux.next;
            
        }
         p.next=aux.next;
    }
    
    public int CountOdds(){
        
        
        Node aux = head;
        int cont=0;
        while(aux.next!=null){
            aux= aux.next;
            
            if(aux.data%2==1){
                cont ++;
                  
                                
            }
                
                
        }
      return cont;        
    }
  

    
    public void RemoveIntercalated(){
        
        Node aux = head, p=head;
        
        int c =  count();
        for(int i=0; i<c; i++){
            
            if(i%2==1){
                
                p.next=aux.next;// lo desconecta
               
            }
            p=aux;  
            aux=aux.next;
        }        
              
    }
    
    public int DuplicateIntercalated(){
        
        Node p=head, aux=head;
        
        while(aux!=null){
            
             Node n=new Node (p.data);
             aux=aux.next;
             p.next=n;
             n.next=aux;
             p=aux;
            
            
        }
        return 0;
        
    }
    
    public void RemoveRecurrents(){
        
        Node p=head,aux=head,back=head;
        
        
        while(aux.next!=null){
            
            p=head;
            while(p!=aux){
               
                if(p.data==aux.data){
                    back.next=aux.next;
                     aux=aux.next;
                }
                p=p.next;
                
            }
                           
            back=aux;
            aux=aux.next;
        }  
    }
    
    
    
}
