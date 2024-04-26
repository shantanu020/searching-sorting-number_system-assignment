package Searching;
public class LastOccurence {
	public static void lastOccur(int [] arr,int target) {
		int m=arr.length;
		int result = 0;
		int low=0;
		int high=m-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				result=mid;
				low=mid+1;
			}else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		if(arr[result]==target) {
			System.out.println(result);
		}else {
			System.out.println("-1");
		}
	}

	public static void main(String[] args) {
		
		int arr1[]= {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
		int arr2[]= {2, 2, 2, 6, 6, 18, 29, 30, 30, 30};
		lastOccur(arr1,4);
		lastOccur(arr2,15);
	}

}
