//Wajp to find the count of vowels and consenont in the given array.
import java.util.*;
import java.util.Arrays;
class Vowelaconsonent
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();

		System.out.println("Enter array elements ");
		char [] arr=new char[size];
 
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.next().charAt(0);
			
		}
		int vCount=0;
		int cCount=0;

		for (int i=0;i<size ;i++ ) 
		{
			if(arr[i]=='a'|| arr[i]=='e' || arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u' )
			{
				vCount++;
			}
		    else
		    {

			   cCount++;
     		}
	    }
	    System.out.println("Vowel count: "+vCount);
	    System.out.println("Consonent count :"+cCount);
	}
}

