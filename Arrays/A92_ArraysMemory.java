package Arrays;

public class A92_ArraysMemory {
  public static void main(String[] args) throws Exception {
    int [] arr;
    arr = new int[5];
    arr[0] = 33;
    arr[1] = 47;
    arr[2] = 59;
    arr[3] = 67;
    arr[4] = 98;
     
    int [] two = arr;
    two[2] = 590;

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for(int i=0; i<two.length; i++){
      System.out.print(two[i] + " ");
    }
  }

  
}
