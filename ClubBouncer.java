public class ClubBouncer
{
  public static void main (String [] args)
  {
    int age =20;
    boolean onGuestList = false;
    double allure =7.5;
    String gender = "M";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >=8))
    {
      System.out.println("You are allowed to enter the club.");
    }
    //System.out.println("What happens now?"); gives and "else without if error"
    else
    {
      System.out.println("You are not allowed to enter the club.");
    }

  }
}
