import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array.");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter elements of the array.");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		System.out.println("sorted array:"+Arrays.toString(arr));
	}

}
