/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtrees;

import java.util.Vector;
import java.util.Stack;

/**
 *
 * @author AULA1
 */
public class tree {
   private  Node root;
  
   
   public tree(){
       root=null;
   }
   
   public void add (int d){
      Node  n = new Node(d);
      if(root==null){
          root=n;
      }else{
          Node aux = root, p=root;
          while(aux!=null){
              if(d<aux.data){
                  p=aux;
                  aux=aux.left;
              }else if(d>aux.data){
                  p=aux;
                  aux=aux.right;
              }else{
                  return;
              }
                  
          }
          
          if(d< p.data){
              p.left=n;
          }else{
              p.right=n;
          }
      }
      
   }
   
   public void printpath(int d){
       Vector <Node> path = new Vector<Node>();
              Node aux=root;
              while(aux!=null){
                  path.add(aux);
                  if(d>aux.data){
                      aux=aux.right;
                  }else if(d< aux.data){
                      aux=aux.left;
                  }else{
                      for(int i=0; i< path.size();i++){
                          System.out.println(""+path.elementAt(i).data);
                      }
                      System.out.println("");
                      return;
                  }
              }
              System.out.println("DOESN'T EXIST");
   }
   
   public boolean isLeaf(int d){
       
       Node aux=root;
       while(aux!=null){
           if(d>aux.data){
               aux=aux.right;
           }else if(d<aux.data){
               aux=aux.left;
           }else{
               if(aux.right==null&&aux.left==null){
                   return true;
               }else{
                   return false;
               }
           }
       }
       
       return false;
       
   }
   
   public void print(){
       Node aux=root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
       while(!s.empty()){
           aux=s.pop();
           System.out.println(""+aux.data);
           aux=aux.right;
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
   }
   
   public int Count(){
       
       int cont=0;
       Node aux=root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
        while(!s.empty()){
           aux=s.pop();
           cont++;
           aux=aux.right;
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
        return cont;
   }
   
   public void Printleafs(){
       
       Node aux = root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
        while(!s.empty()){
           aux=s.pop();
           aux=aux.right;
           
           if(aux.left==null&&aux.right==null){
               System.out.println(""+aux.data);
           }
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
   }
   
   public int Max(){
       if(root==null)return -1;
       
       Node aux=root;
       while(aux.right!=null){
           aux=aux.right;
       }
       return aux.data;
   }
   
    public int Min(){
       if(root==null)return -1;
       
       Node aux=root;
       while(aux.left!=null){
           aux=aux.left;
       }
       return aux.data;
   }
    
    public void recursivePrint(){
        
        recursivePrint(root);
        System.out.println();
        
    }
    
    private void recursivePrint(Node r){
        
        if(r==null) return;
        
        recursivePrint(r.left);
        System.out.println(""+ r.data);
        recursivePrint(r.right);
    }
    
    public int recursiveCount(){
        return recursiveCount(root);
    }
    
    private int recursiveCount(Node r){
    
        if(r==null) return 0;
        
        return recursiveCount(r.left) +
                
        recursiveCount(r.right) +1;
}
    
   public void PreOrderPrint(){
        
        PreOrderPrint(root);
        System.out.println();
        
    }
    
    private void PreOrderPrint(Node r){
        
        if(r==null) return;
        
        System.out.println(""+ r.data);
        PreOrderPrint(r.left);
        PreOrderPrint(r.right);
    } 
    
     public void inOrderPrint(){
        
        inOrderPrint(root);
        System.out.println();
        
    }
    
    private void inOrderPrint(Node r){
        
        if(r==null) return;
        
        
        inOrderPrint(r.left);
        System.out.println(""+ r.data);
        inOrderPrint(r.right);
    } 
    
     public void PostOrderPrint(){
        
        PostOrderPrint(root);
        System.out.println();
        
    }
    
    private void PostOrderPrint(Node r){
        
        if(r==null) return;
        
        
        PostOrderPrint(r.left);
        PostOrderPrint(r.right);
        System.out.println(""+ r.data);
    } 
    
    public void PrintLeafsR(){
        PrintLeafsR(root);
        System.out.println();
    }
    
    private void PrintLeafsR(Node r){
        
        if(r==null) return;
        if(r.left==null && r.right==null){
            System.out.println(""+r.data);
            return;
        }
        PrintLeafsR(r.left);
        PrintLeafsR(r.right);
    }
                           
        public int Height (){
       return Height(root);
   }
        
   private int Height (Node r){
       
       if(r==null) return 0;
              
       int a= Height(r.left);
       int b= Height(r.right);//UNDER CONSTRUCTION
       return Math.max(a, b)+1;
   }

}
