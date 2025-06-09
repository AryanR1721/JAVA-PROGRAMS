import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Length of array: ");
    int len = sc.nextInt();

    int[] arr = new int[len];

    System.out.println("Array elements: ");
    for(int i = 0; i < len; i++){
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter number to be found: ");
    int key = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if(key == arr[i]){
        System.out.println("Found at index: " + i);
      }      
    }
  }
}