// Program 1

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
// 	    byte [] [] arr= new byte[2][3];
// 	    arr[0][0]=10;
// 	    arr[0][1]=20;
// 	    arr[0][2]=30;

// 	    arr[1][0]=40;
// 	    arr[1][1]=50;
// 	    arr[1][2]=60;

// 	    System.out.println(Arrays.deepToString(arr));
// 	}
// }

// Program 2

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
// 	    int [] [] arr= new int [3][];

// 	    arr[0] = new int[2];
// 	    arr[0][0]=100;
// 	    arr[0][1]=200;

// 	    arr[1] = new int[1];
// 	    arr[1][0]=300;

// 	    arr[2] = new int[2];
// 	    arr[2][0]=400;
// 	    arr[2][1]=500;

// 	    System.out.println(Arrays.deepToString(arr));
// 	}
// }

// Program 3

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
//          int [] [] [] arr=new int [2] [2] [2];
//          arr[0][0][0]=10;
//          arr[0][0][1]=20;

//          arr[0][1][0]=30;
//          arr[0][1][1]=40;

//          arr[1][0][0]=50;
//          arr[1][0][1]=60;
//          arr[1][1][0]=70;
//          arr[1][1][1]=80;         
//          System.out.println(Arrays.deepToString(arr));
// 	}
// }

// Program 4

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
//          int [][][] arr = new int [2][2][];
//          arr[0][0] = new int[1];
//          arr[0][1] = new int[2];
//          arr[0][0][0]=10;
//          arr[0][1][0]=20;
//          arr[0][1][1]=30;

//          arr[1][0] = new int[1];
//          arr[1][1] = new int[3];
//          arr[1][0][0]=40;
//          arr[1][1][0]=50;
//          arr[1][1][1]=60;
//          arr[1][1][2]=70;
//          System.out.println(Arrays.deepToString(arr));
// 	}
// }

// [[[0], [0, 0]], [[0], [0, 0, 0]]]
// Progarm 5

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
//          int [][][] arr = new int [2][][];
//          arr[0] = new int[3][1];

//          arr[0][0][0]=11;
//          arr[0][0][1]=22;
//          arr[0][0][2]=33;

//          arr[1] = new int[2][];
//          arr[1][0]new int[2];
//          arr[1][0][0]=45;
//          arr[1][0][1]=90;
//          arr[1][1][0]=77
//          arr[1][1][1]=78;
//          arr[1][1][2]=79;

//          arr[1][1]=new int [3];


//          o/p--   //[[[0], [0], [0]], [[0, 0], [0, 0, 0]]]

         
//          System.out.println(Arrays.deepToString(arr));
// 	}
// }

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
//          int [][][] arr = new int [3][][];
//          arr[0] = new int[1][2];
//          arr[1] = new int[2][2];
//          arr[2] = new int[3][2];
           
         
         
//          System.out.println(Arrays.deepToString(arr));
// 	}

// }
// [[[0, 0]], [[0, 0], [0, 0]], [[0, 0], [0, 0], [0, 0]]]

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
//          int [][][][] arr = new int [2][][][];
//          arr[0] = new int[2][1][1];
//          arr[1] = new int[3][][];

//          arr[1][0] = new int[1][1];
//          arr[1][1] = new int [2][1];
//          arr[1][2] = new int[3] [1];

                
//          System.out.println(Arrays.deepToString(arr));
// 	}

// }


// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
//          int [][][][] arr = new int [2][][][];
//          arr[0] = new int[2][1][1];
//          arr[1] = new int[3][][];

//          arr[1][0] = new int[1][1];
//          arr[1][1] = new int [2][1];
//          arr[1][2] = new int[3] [1];

                
//          System.out.println(Arrays.deepToString(arr));
// 	}

// }



// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
// 		char [][]arr={{a,b},{c,d,e},{f,g}};
// 		System.out.println(Arrays.deepToString(arr));
// 	}
// }

// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
// 		int[][][]arr={{{10,10},{30,40,50}},{{60},{70,80,90,100}}};
// 	}
// }



// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
// 		int[][][]arr={{{2,4},{8,6,10},{12},{14,16},{18}}};
// 		System.out.println(Arrays.deepToString(arr));

// 	}
// }




// import java.util.*;
// class ArrayExample
// {
// 	public static void main(String[] args) {
// 		int[][][]arr={{10,20,30},{40,50},{60,70,80}}
//  		System.out.println(Arrays.deepToString(arr));

// 	}
// }
//write a java program to fetch negative nos in an arrays


//write a java program to reverse elements in an array

import java.util.*;
class ArrayExample{
	public static void main(String[] args) {
		int arr[]={1,7,8,9,4,1,2};
		for(int i=arr.length-1;i>=10;i--)
		{
			System.out.println(arr[i]+" ");
		}
	}
}

