/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*****************************0.**************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
	    int start = 0;
	    int end = arr.length -1;
	    while(start<end)
	    {
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	    start++;
	    end--;
	}
	System.out.println("reversed order : "+ Arrays.toString(arr));
  }
}