
public class BinarySearch {
	static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,10,100,122,143};
		int target=100;
		System.out.println(binarySearch(arr,target));
	}

}
