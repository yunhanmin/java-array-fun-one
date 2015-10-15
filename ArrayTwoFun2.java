/*
 * Project: ArrayTwoFun2.java
 * Description: Learning 2D arrays 2
 * Name: Hanmin Yun
 * Date: Oct 15, 2015
 */
   
  public class ArrayTwoFun2 {
  
    public static String capitalize( String str ) {
     return str.substring(0, 1).toUpperCase() + str.substring(1); 
    }
    
  public static void main( String[] args ) {
    
    String[][] pizza = {
      {
        "crust",               // pizza[i][0] = category heading
        "original",
        "thin",
        "deep dish"
      },
      {
        
      },
      {
        "toppings",              // [] [] [] [] => 4 crust
        "cheese",                // [] [] [] [] [] [] [] [] [] [] [] [] [] [] => 10 toppings
        "olives",                // [] [] [] [] [] [] [] [] => 7 extras
        "pepperoni",
        "potatoes",
        "peppers",
        "onions",
        "anchovies",
        "bbq chicken",
        "beef",
      },
      {
       "extras",
        "sweet potato mousse",
        "cola",
        "cider",
        "parmensan",
        "hot sauce",
        "garlic dipping sauce"
      }
    };
    System.out.println( "Welcome to Papa John's Pizza! Can I take your") ;
    System.out.println( "Here are your choices: " );
    
    for( int i=0; i<pizza.length; i++ ) { // run through the ROWS (3)
      for( int j=0; j<pizza[i].length; j++ ) { // run thrugh COLUMNS
        if( j==0 ) {
         System.out.println( capitalize ( pizza[i][j] ) + " choices: " ); 
        }else {
         System.out.print( j + ") " + capitalize (pizza[i][j] ) +  ", " ); 
        }
      }
      System.out.println();
    }
      
  } // END main()
  
} // END class