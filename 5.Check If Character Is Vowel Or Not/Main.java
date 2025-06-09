import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean is_vowel = false;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    char letter = sc.next().charAt(0);

    for (int i = 0; i < vowels.length; i++) {
      if (Character.toLowerCase(letter) == vowels[i]) {
        is_vowel = true;
      }
    }

    if(is_vowel == true){
      System.out.println("vowel");
    }
    else {
      System.out.println("Not a vowel");
    }
  }
}