public class CreatingVariables
{
  public static void main( String [] args)
  {
    int x, y, age, z;
    double seconds, e, checking, C;
    String firstName, lastName, title, DOB, LastFour;

    x=10;
    y=400;
    age=39;
    z=1;
    C=2.99*100000000;
    seconds=4.71;
    e= 2.71828182845904523536;
    checking=1.89;

    firstName="Graham";
    lastName="Mitchell";
    title="Mr.";
    DOB= "July 16, 1969";
    LastFour= "1235";

    System.out.println( "The variable x contains "+x);
    System.out.println( "The value "+y+" is stored in the variable y.");
    System.out.println( "The experiment took "+seconds+" seconds.");
    System.out.println( "A favorite irragional # is Euler's number: " +e);
    System.out.println( "Hopefully you have more than $" +checking+ "!");
    System.out.println( "My Name's "+title+" "+firstName + lastName);
    System.out.println( "The Variable \"z\" = "+z);
    System.out.println( "C = "+C);
    System.out.println( firstName+ " was born on " +DOB);
    System.out.println( "His last four are "+LastFour);
  }
}
