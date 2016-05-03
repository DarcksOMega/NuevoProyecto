/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author deivyponal
 */
public class list {
    
    private int data [];
    private int top;
    
    public list (){
        
        data=new int [100];
        top= 0;
        
    }
    
    public void add (int d,int index){
        
        top++;
        if(index<top){
       for(int i=top-1;i>=index;i--){
           data[i+1]=data[i];
       }
        data[index]=d;
    }
    }
    
    public int remove(int n){
        
      int re;
      re=data[n];
       for(int i=n;i<top;i++){
           data[i]=data[i+1];
       }
      top--;
      
      return re;
              
    }
    
     public void print(){
        
        for (int i=0;i<top;i++){
            
            
        
            System.out.print(" " + data[i]);
        }
        System.out.println();
}
}

