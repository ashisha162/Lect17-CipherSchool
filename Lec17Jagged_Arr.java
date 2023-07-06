
import java.util.*;

 class Lec17Jagged_Arr
{
static void printJaggedArray(int arr[][])
	{
for(int i=0; i<arr.length; i++)
{
for(int j=0; j<arr[i].length; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
	}
	
	

  public static void main(String[] args)
  {
  int arr[][]=new int [3][];
  arr[0]=new int[3];
  arr[1]=new int[2];
  arr[2]=new int[3];

 printJaggedArray(arr);
int arr2[]=new int[3][];
//arr2[0]=(1,2,3); //we have already declared the Array
//arr2[1]=(7,8);// we cannot use the initilizer list here because it doesn't create an object 
//arr2[3]=(9,8,6);

//Anonymous Arrays
arr2[0]=new int[] {1,2,3};
  arr2[1]=new int []{7,8};
arr2[2]=new int[]{9,8,6};
System.out.println("*******************************");
printJaggedArray(arr2);

  
  
  }
  }