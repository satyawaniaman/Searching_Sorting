import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last=arr.length-1;
			int max=maxIndex(arr,0,last);
			int temp=arr[max];
			arr[max]=arr[last];
			arr[last]=temp;
		}
	}
	static int maxIndex(int[] arr,int start,int end) {
		int max=start;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array.");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter elements of the array.");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		selectionSort(arr);
		System.out.println("sorted array:"+Arrays.toString(arr));

	}

}
