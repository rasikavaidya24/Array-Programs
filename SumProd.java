// import java.util.*;
// class SumProd
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the array size");
// 		int size =sc.nextInt();
// 		System.out.println("Enter array elements :");
// 		int []arr=new int[size];

// 		int sum=0;
// 		int prod=1;

// 		for (int i=0;i<size ;i++ ) {
// 			arr[i]=sc.nextInt();
// 			sum=sum+arr[i];
// 			prod=prod*arr[i];
		 	
// 		 } 
// 		 System.out.println("sum:"+sum);
// 		 System.out.println("Product :"+prod);
// 	}
// }

//2D array
import java.util.*;
class SumProd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows =sc.nextInt();
		System.out.println("Enter the no of cols :");
		int cols=sc.nextInt();

		int[][]arr=new int[rows][cols];
		int sum=0;
		int prod=1;


		for (int i=0;i<rows ;i++ ) 
		{
			for (int j=0;j<cols ;j++ ) 
			{
				arr[i][j]=sc.nextInt();
				
			}			
		}
		for (int i=0;i<rows ;i++ ) 
		{
			for (int j=0;j<cols ;j++ ) 
			{
				System.out.println(arr[i][j]+"");		
			}
			sum=sum+arr[i][j];
			prod=prod*arr[i][j];
		}
		System.out.println("sum:"+sum);
		System.out.println("Product :"+prod);
 	}
}


