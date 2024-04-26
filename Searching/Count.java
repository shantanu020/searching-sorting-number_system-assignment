package Searching;

public class Count {
	public static void countOne(int arr[]) {
		int m=arr.length;
		int result = 0;
		int low=0;
		int high=m-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==1) {
				result=mid;
				high=mid-1;
			}else if(arr[mid]>1) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println("total number of ones: "+(m-result));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {0, 0, 0 ,0, 1, 1, 1, 1, 1, 1};
		int arr2[]= { 0, 0, 0, 0, 0, 1, 1};
		countOne(arr1);
		countOne(arr2);
	}

}
