import static java.lang.Math.*;
import java.util.Scanner;
public class solvemyquad
{
  public static void main(String args[])
  {
    for (int i = 0; i < 50; ++i) System.out.println(); //Clears screen
    Scanner sc = new Scanner(System.in);
    double a, b, c, step1, step2, step3a, step3b, ans; //Needs cleaning up
    double nr, nr2, nr3;
    char square = '√';
    System.out.println("What is your a value?");
    a = sc.nextDouble();
    System.out.println("What is your b value?");
    b = sc.nextDouble();
    System.out.println("What is your c value?");
    c = sc.nextDouble();

    step1 = (b * b) - 4*(a)*(c);
    step2 = sqrt(step1);
    step3a = -b + step2;
    step3b = -b - step2;
    step3a = step3a / (2*a);
    step3b = step3b / (2*a);

    System.out.print("\nX values: ");
    System.out.printf("%.4f, %.4f\n", step3a, step3b);

    System.out.printf("\n%.2f +- %c%.4f\n", -b, square, step1);
    System.out.printf("-----------------\n");
    double twoa = 2 * a; //A bit messy
    System.out.printf("%.5f\n", twoa);


  }
}
