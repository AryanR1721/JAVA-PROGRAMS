import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		boolean arrequal = Arrays.equals(arr1,arr2);
		if(arrequal)
		{
		    System.out.println("both arrays are same");
		}
		else
		{
		    System.out.println("both arrays are not equal");
	}
}
}
