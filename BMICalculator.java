import java.util.Scanner;

public class BMICalculator
{
  public static void main(String [] args)
  {
    Scanner keyboard=new Scanner(System.in);
    double feet,inches,totIn,totM,pounds,bmi;

    System.out.print ("Enter your height in feet. (Ex. if you are 6 ft. 3 in. type 6, press enter, and then type 3 and press enter): ");
    feet=keyboard.nextDouble();
    inches=keyboard.nextDouble();
    totIn=((feet*12)+inches);
    totM=totIn*0.0254;

    System.out.print("Enter Your weight in pounds: ");
    pounds=keyboard.nextDouble();

    bmi=(pounds*0.453592)/(totM*totM);
    System.out.println(" ");
    System.out.println("Your Weight in Pounds : "+pounds);
    System.out.println("Your Height : "+feet+"' "+inches+"\"");
    System.out.println("Your BMI is "+ bmi);
  }
}
