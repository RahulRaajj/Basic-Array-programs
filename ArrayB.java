import java.util.Scanner;
import java.util.Arrays;
class ArrayB{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr []=new int [size];
		for (int i=0;i<arr.length ;i++ ) {
			System.out.println("Enter the values at index "+i);
			int index= sc.nextInt();
			arr[i]=index;
		}
		System.out.println("You have selected the given values in the array ");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.println(arr[i]);			
		}
		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=0;j<arr.length-1-i ;j++ ) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
		}
		}			
		}
		System.out.println("After sorting ascending, we get the values as "+Arrays.toString(arr));

		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=0;j<arr.length-1-i ;j++ ) {
				if (arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}				
			}			
		}

		System.out.println("After sorting descending, we get "+Arrays.toString(arr));
	}
}