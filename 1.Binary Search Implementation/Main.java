import java.util.*;

public class Main {
  public static int bs(int[] array, int num) {
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = (start + end)/2;

      if (array[mid] == num) {
        return mid;
      } else if (array[mid] < num) {
        start = mid + 1;
      }
      else {
        start = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Length of array: ");
    int array_len = sc.nextInt();
    int[] arr = new int[array_len];

    System.out.println("Enter array elements: ");

    for(int i = 0; i < array_len; i++){
      arr[i]  = sc.nextInt();
    }

    System.out.print("Enter number to be found: ");
    int num_find = sc.nextInt();

    Arrays.sort(arr);

    System.out.println("The array is : ");
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

    int index = bs(arr, num_find);

    System.out.println(num_find + " found at index " + index);
  }
}