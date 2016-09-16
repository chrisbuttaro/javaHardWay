import java.util.Scanner;

public class ComparingNumbers
{


public static void main(String[] args)
  {
  Scanner keyboard= new Scanner(System.in);

  double first, second;

  System.out.print( "Give me two numbers. First: " );
  first = keyboard.nextDouble();
  System.out.print( "Second: " );
  second = keyboard.nextDouble();

  if ( first < second )
  {
    System.out.println( first + " is LESS THAN " + second );
  }
  if ( first <= second )
  {
    System.out.println( first + " is LESS THAN/EQUAL TO " + second );
  }
  if ( first == second )
  {
    System.out.println( first + " is EQUAL TO " + second );
  }
  if ( first >= second )
  {
    System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
  }
  if ( first > second )
  {
    System.out.println( first + " is GREATER THAN " + second );
  }
  if ( first != second )
  System.out.println( first + " is NOT EQUAL TO " + second );

  /*Study drill: The "Hey line will print in any if statement that is true,
  I'm not sure what the second study drill is asking me to do."*/

  }
}
