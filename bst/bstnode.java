/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;
import java.util.Scanner;
/**
 *
 * @author Naughty
 */



public class bstnode {
  bstnode right,left;
  int data;
  
  bstnode(){
   right=null;
   left=null;
   data=0;
  }
     public bstnode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     
  public void setright(bstnode k){
     right = k;
  }
  public void setleft(bstnode k){
     left=k;
  }
    public bstnode getright(){
    return right;
    }
    public bstnode getleft(){
      return left;
    }
      public void setData(int d)
     {
         data = d;
     }
  
     public int getData()
     {
         return data;
     }   
}

