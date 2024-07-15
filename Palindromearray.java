//wajp to check if array is palindrome.
//1) create a array of char datatype.
//2) Reverse the array and size it an reversed array
//3) compare both arrays using array equals()
import java.util.*;
import java.util.Arrays;
class Palindromearray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		System.out.println("Enter array elements ");
		char [] arr=new char[size];

		    //insert  
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.next().charAt(0);
			
		}

		char [] reversedArray=new char[size];
		int temp=0;
		for (int i=arr.length-1;i>=0 ;i-- ) 
		{
			reversedArray[temp]=arr[i];
			temp++;			
		}

		if (Arrays.equals(arr,reversedArray)) 
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}