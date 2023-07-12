import java.util.*;
public class First{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		/*System.out.print("Enter your name: ");
		String name=sc.next();
		
		System.out.print("Enter your age: ");
		String age=sc.next();
		
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2=sc.nextInt();
		
		System.out.print("Summation is: "+(num1+num2));*/
		
		System.out.print("Enter length of the array: ");
		int len=sc.nextInt();
		
		int arr[]=new int[len];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
		System.out.print("array elements are: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int arr2[]=new int[len+1];
		System.out.print("enter new element");
		int num=sc.nextInt();
		
		System.out.print("enter index");
		int index=sc.nextInt();
		
		System.out.println();
		
		for(int i=0;i<index;i++){
			arr2[i]=arr[i];
		}
		arr2[index]=num;
		
		for(int i=index+1;i<arr2.length;i++){
			arr2[i]=arr[i-1];
		}
		System.out.print("new array elements are: ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
