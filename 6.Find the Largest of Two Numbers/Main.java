import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
     

      int max_no = (Math.max(a, b));

      System.out.println("Maximum number of " + a + " " + b + " and is " + max_no);
    }  
}