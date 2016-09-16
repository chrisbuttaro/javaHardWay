import java.util.Scanner;

public class RudeQuestions
{
  public static void main (String [] args)
  {
    String name;
    int age;
    double weight, income, number, square;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    System.out.println("Which number would you like squared?");
    number= keyboard.nextDouble();
    square=number*number;
    System.out.println("The square of "+number+" = "+square);


    /*I don't think it would blow up with an int if expecting a double but
    probably vise versa, also I think it will accept a number for a string*/
  }
}
