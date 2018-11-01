package com.learning.myhackathon.util;

public class ContinueAndBreak {

  public static void main(String[] args){
    System.out.println("program started");

    for(int i=0; i<20000; i++){
      System.out.println("Iterating i:"+i);
      for(int j=0; j<10000; j++){
        System.out.println("Iterating j:"+j);
        if(j==10){
          System.out.println("J is 10 now:"+j);
          break;
        }
        System.out.println("inner for loop");
      }
      System.out.println("outer for loop");
    }

    System.out.println("exiting program");
    //System.exit(1);
  }
}
