import java.util.Scanner;
class ArrayA{
	public static void main(String[] args) {
		System.out.println("<<<<<=======Program starts======================>>>>>>>>");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		//System.out.println("You have choosen the size of the array "+size);
		int arr []=new int[size];
		
        for (int i=0;i<arr.length ;i++ ) {
        	System.out.println("Enter the values you want in array at index "+i );
        	int index=sc.nextInt();
        	arr[i]=index;
        }
        System.out.println("You have selected the values below- ");
		
        for (int i=0;i<arr.length ;i++ ) {
        	System.out.println(arr[i]);        	
        }
		
        int max= arr[0];   // To find the highest number in the array
        for (int i=0;i<arr.length ;i++ ) {
        	if (max<arr[i]) {
                max=arr[i];       		
        	}        	
        }
        System.out.println("The maximum number in the given array is "+max);
		

        int min=arr[0];     // To find the lowest number in the array
        for (int i=0;i<arr.length ;i++ ) {
        	if (min>arr[i]) {
        		min=arr[i];        		
        	}        	
        }
        System.out.println("Minimum number in the given array is "+min);
		

        int maximum=arr[0];
        int sec=0;
        for (int i=0;i<arr.length ;i++ ) {    //To find the second highest number in the array
        	if (maximum<arr[i]) {
        		sec=maximum;
        		maximum=arr[i];
        	}
        		else if (arr[i]>sec && arr[i]!=maximum) {
        			sec=arr[i];        			
        		}        		
        	}
        	System.out.println("Second max is "+sec);        	
        }
	}	
