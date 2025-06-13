import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 6, 8, 9, 11};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even number");
                evenCount++;
            } else {
                System.out.println(arr[i] + " is odd number");
                oddCount++;
            }
        }

        System.out.println("Total number of even numbers = " + evenCount);
        System.out.println("Total number of odd numbers = " + oddCount);
    }
}
