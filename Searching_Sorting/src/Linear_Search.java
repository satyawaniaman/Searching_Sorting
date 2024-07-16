import java.util.Iterator;

public class Linear_Search {
	static int linearSearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {12,1,33,22,11,-11};
		int target=33;
		System.out.println(linearSearch(arr,target));
	}

}
