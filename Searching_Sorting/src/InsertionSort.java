import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	static void insertionSort(int[] arr ) {
		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
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
		insertionSort(arr);
		System.out.println("sorted array:"+Arrays.toString(arr));

	}

}
