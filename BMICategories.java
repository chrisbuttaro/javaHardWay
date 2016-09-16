import java.util.Scanner;

public class BMICategories
{
  public static void main (String [] args)
  {
    Scanner keyboard =new Scanner(System.in);

    double feet,inches,totIn,totM,pounds,bmi;

    System.out.print ("Enter your height in feet. (Ex. if you are 6 ft. 3 in. type 6, press enter, and then type 3 and press enter): ");
    feet=keyboard.nextDouble();
    inches=keyboard.nextDouble();
    totIn=((feet*12)+inches);
    totM=totIn*0.0254;
    
    System.out.print("Enter Your weight in pounds: ");
    pounds=keyboard.nextDouble();

    bmi=(pounds*0.453592)/(totM*totM);

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 )
    {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 )
    {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 )
    {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 )
    {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 )
    {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 )
    {
      System.out.println( "moderately obese" );
    }
    else if (bmi < 40.0)
    {
      System.out.println( "severely obese");
    }
    else
    {
      System.out.println( "very severely/\"morbidly\" obese");
    }
  }
}
