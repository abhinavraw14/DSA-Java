package Arrays;

import java.util.*;

public class A93_SpanOfArray {

  public static int max(int []arr){
    int maxNumber = arr[1];
    for(int i=0; i<arr.length; i++){
      if(arr[i] > maxNumber){
        maxNumber = arr[i];
      }
    }

    return maxNumber;
  }

  public static int min(int [] arr){
    int minNumber = arr[1];

    for(int i=0; i<arr.length ; i++ ){
      if(arr[i] < minNumber){
        minNumber = arr[i];
      }
    }
    return minNumber;

  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for(int i=0; i< arr.length; i++){
      arr[i] = sc.nextInt();

    }

    int span = max(arr) - min(arr);
    System.out.println(span);
    
  }
  
}
