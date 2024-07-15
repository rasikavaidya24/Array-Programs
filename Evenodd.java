//wajp t store even and odd elements in two different arrays
import java.util.*;
class Evenodd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size =sc.nextInt();
		System.out.println("Enter array elements :");
 		int []arr=new int[size];

        //inserting array elements dynamically//
        for (int i=0;i<size ;i++ ) 
        {
        	arr[i]=sc.nextInt();
        }

        int evenCount=0;
        int oddCount=0;
        for (int i=0;i<size;i++ ) 
        {
        	if(arr[i]%2==0)
            {
            	evenCount++;
            } 
            else
            {
            	oddCount++;
            }       	
        }


		int []evenArr=new int[evenCount];
		int []oddArr=new int[oddCount];

		int itt1=0;
		int itt2=0;
		for (int j=0;j<size ;j++ ) 
		{
			if(arr[j]%2==0)
			{
				evenArr[itt1++]=arr[j];
			}
			else
			{
				oddArr[itt2++]=a+rr[j];
			}			
		}
		System.out.println("even : "+Arrays.toString(evenArr));
		System.out.println("odd :"+Arrays.toString(oddArr));
	}

}

//o-p=
Enter the array size
4
Enter array elements :
2
5
3
7
even : [2]
odd :[5, 3, 7]


     