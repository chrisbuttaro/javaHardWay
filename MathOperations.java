public class MathOperations
{
  public static void main( String[] args )
  {
    int a, b, c, d, e, f, g;
    double x, y, z, q, w;
    String one, two, both;

    a = 10;
    b = 27;
    q = 0;
    w = 0;

 System.out.println( "a is " + a + ", b is " + b );
    c = a + b;
 System.out.println( "a+b is " + c );
    d = a - b;
 System.out.println( "a-b is " + d );
    e = a+b*3;
 System.out.println( "a+b*3 is " + e );
    f = b / 2;
 System.out.println( "b/2 is " + f );
    g = b % 10;
 System.out.println( "b%10 is " + g );

    x = 1.1;
 System.out.println( "\nx is " + x );
    y = x*x;
 System.out.println( "x*x is " + y );
    z = b / 2;
 System.out.println( "b/2 is " + z );
 System.out.println();

 one = "dog";
 two = "house";
 both = one + two;

 System.out.println( both );
 System.out.println();
 q=x%1;
 w=g*3;
 double sum, difference, product, mod;
 sum=q+w;
 difference=java.lang.Math.abs(q-w);
 product = q*w;
 mod=q%w;

 System.out.println("q ="+q);
 System.out.println("w = "+w);
 System.out.println("Thier sum is "+sum);
 System.out.println("Thier difference is " +difference);
 System.out.println("Their Product is " +product);
 System.out.println("q mod w =" +mod);
 }

}
