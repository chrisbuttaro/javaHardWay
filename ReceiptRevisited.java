 import java.io.IOException;
 import java.io.PrintWriter;
 import java.util.Scanner;

 public class ReceiptRevisited{
 public static void main( String[] args ) {
 PrintWriter fileout;
 Double ppg=3.459, numG;

 Scanner keyboard= new Scanner(System.in);

 try {
 fileout = new PrintWriter("receipt.txt");
 }
 catch ( IOException err ) {
 System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
 System.out.println("Maybe the file exists and is read-only?");
 fileout = null;
 System.exit(1);
 }
 System.out.println("Type the number of Gallons you would like and press enter");
  numG=keyboard.nextDouble();
  ppg=ppg*numG;

 fileout.println( "+------------------------+" );
 fileout.println( "|                        |" );
 fileout.println( "| CORNER STORE           |" );
 fileout.println( "|                        |" );
 fileout.println( "| 2014-06-25 04:38PM     |" );
 fileout.println( "|                        |" );
 fileout.println( "| Gallons: "+numG+"          |" );
 fileout.println( "| Price/gallon: $ 3.459  |" );
 fileout.println( "|                        |" );
 fileout.println( "| Fuel total: $ "+ppg+"   |" );
 fileout.println( "|                        |" );
 fileout.println( "+------------------------+" );
 fileout.close();
  }
 }
