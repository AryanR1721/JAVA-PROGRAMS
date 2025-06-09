import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String username = "Aryan R";
    String pwd = "123";

    String input_user = sc.nextLine();
    String input_pwd = sc.nextLine();

    if (input_user.equals(username) && input_pwd.equals(pwd)){
      System.out.println("Welcome " + username);
    }
    else {
      System.out.println("Login Failed");
    }
  }
}