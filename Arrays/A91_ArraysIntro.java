package Arrays;

public class A91_ArraysIntro {
  public static void main(String[] args) {
    // Different ways to declare arrays in Java
    
    // 1. Declaration only (no size specified)
    int[] arr1;
    
    // 2. Alternative syntax (less common)
    int arr2[];
    
    // 3. Declaration with size (all elements initialized to default values)
    int[] arr3 = new int[5]; // default values: 0 for int
    
    // 4. Declaration with array literal (size determined by number of elements)
    int[] arr4 = {1, 2, 3, 4, 5};
    
    // 5. Declaration with anonymous array
    int[] arr5 = new int[]{10, 20, 30, 40, 50};
    
    // 6. Multi-dimensional arrays
    int[][] matrix = new int[3][4]; // 3 rows, 4 columns
    
    // 7. Multi-dimensional with initialization
    int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
    
    // Printing array lengths
    System.out.println("arr4 length: " + arr4.length);
    System.out.println("matrix rows: " + matrix.length);
    System.out.println("matrix columns: " + matrix[0].length);
    
    // Accessing array elements
    
    // 1. Accessing individual elements by index (0-based)
    System.out.println("First element of arr4: " + arr4[0]);
    System.out.println("Last element of arr4: " + arr4[arr4.length - 1]);
    
    // 2. Iterating through array using traditional for loop
    System.out.print("arr4 elements: ");
    for(int i = 0; i < arr4.length; i++) {
      System.out.print(arr4[i] + " ");
    }
    System.out.println();
    
    // 3. Iterating using enhanced for loop (for-each)
    System.out.print("arr5 elements: ");
    for(int num : arr5) {
      System.out.print(num + " ");
    }
    System.out.println();
    
    // 4. Accessing 2D array elements
    System.out.println("matrix2[0][1]: " + matrix2[0][1]);
    System.out.println("matrix2[2][0]: " + matrix2[2][0]);
    
    // 5. Iterating through 2D array using enhanced for loop
    System.out.print("matrix2 elements: ");
    for(int[] row : matrix2) {
      for(int num : row) {
        System.out.print(num + " ");
      }
    }
    System.out.println();
    
    // 6. Iterating through 2D array using traditional for loops
    System.out.print("matrix2 elements (traditional): ");
    for(int i = 0; i < matrix2.length; i++) {
      for(int j = 0; j < matrix2[i].length; j++) {
        System.out.print(matrix2[i][j] + " ");
      }
    }
    System.out.println();
  }
  
}
