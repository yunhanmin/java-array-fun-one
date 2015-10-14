/*
 * Project: ArrayFunTwo.java
 * Description: Learning more about arrays.
 * Name: Hanmin Yun
 * Date: Oct 14, 2015
 */

public class ArrayFunTwo {
  
  public static void main( String[] args ) {
    
    int[] a = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
    int total = 0;
    
    for( int i : a ) {
      total += i;
      System.out.println( "Sum now is: " + total );
    }
    System.out.println();
    
    int[] b = {3, 5, 6, 8, 8, 10, 22 };
    int sum = 0;
    double average = 0;
    int count = 0;
    
    for( int i : b) {
      sum += i;
      count++;
    }
    average = (double) sum / count;
    System.out.println( "\nSum is: " + sum );; // 62
    System.out.println( "Average is: " + (double) sum / count ); // 8.8
    
    /* 2D Array
     * int[] a = {3, 4, 5, 6 }; // 1D
     * int[][] b = { { 3, 4, 5 }, {6, 7, 8 }, {9, 10, 11} ]; // 2D
     */
  } // END main()
  
} // END class