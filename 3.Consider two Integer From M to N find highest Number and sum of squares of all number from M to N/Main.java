import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;

    System.out.println("Enter  the 2 numbers: ");
    int m = sc.nextInt();
    int n = sc.nextInt();

    if(m < n){
      for ( int i = m; i <= n ; i++) {
        sum += i*i*i;
      }
      System.out.println("Sum is: " + sum);
    }
    else if(m == n){
      sum = m*m*m; 
      System.out.println("Sum is : " + sum);
    }
    else {
      System.out.println("M > N");
    }
  }
}