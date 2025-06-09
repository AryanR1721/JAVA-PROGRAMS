import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the 2 numbers: ");
   int a = sc.nextInt();
   int b = sc.nextInt();

   int c = a+b;

   System.out.println("Sum of " + a + " and " + b + " is : " + c);
  }
}