package Arrays;

import java.util.*;
import java.util.Scanner;

public class A97_BarChart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int [] arr= new int[n];
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();

    }

    int max=arr[1];
    for(int i=0; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }

    for(int floor = max; floor>=1; floor--){ //floor
      for(int i =0; i<arr.length; i++){ //building
        if(arr[i] >= floor){
          System.out.print("*\t");
        } else{
          System.out.print("\t");
        }
      }
      System.out.println();

    }

    
  }
  
}
