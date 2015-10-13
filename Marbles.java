/*
 * Project: Marbles.java
 * Description: A String array containing the names of marble colors
 * Name: Hanmin Yun
 * Date: Oct 13, 2015
 */

public class Marbles {
  
  public static void main( String[] args ) {
    
    // 1. Create a String array to hold the names of marble colors
    // 2. Assign "names" to the String array indecies
    // 3. Print the String array names
    
     String[] marbles = { "red", "blue", "orange", "green", "purple" };
    for( int i = 0; i < marbles.length; i++) {
     System.out.println( marbles[i] ); 
    }
    change( marbles );
    System.out.println( "New marbles: " + marbles[0] );
    
    
  } // End main()
  
  public static void change( String[] s ) {
    
    s[0] = "pink";
    
  } // end change
  
} // End class Marbles