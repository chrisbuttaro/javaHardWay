import java.util.Scanner;

public class RunningTotal{

  public static void main(String[]args){

    Scanner keyboard=new Scanner(System.in);

    int current, total =0;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll sotp when you type a zero.");

    /* do {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total +=current;
      System.out.println("the total so far is: "+total);

    }while (current !=0);

    System.out.println("The final total is: "+total);
    */

    current =1;
    while (current !=0){
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total +=current;
      if (current !=0){
      System.out.println("the total so far is: "+total);
      }
    }
    System.out.println("The final total is: "+total);
  }
}
