import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = sc.nextInt();

    if(num >= 10 && num <= 100){
      System.out.println("Number is within the range");
    }
    else {
      System.out.println("Out of range");
    }
  }
}