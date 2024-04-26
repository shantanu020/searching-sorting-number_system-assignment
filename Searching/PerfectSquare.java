package Searching;

public class PerfectSquare {
	public static void perfectSquare(int [] arr,int target) {
		int m=arr.length;
		int result = 0;
		int low=0;
		int high=m-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]*arr[mid]==target) {
				result=mid;
				break;
			}else if(arr[mid]*arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		if(result>0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=16;
		int arr1[]=new int[num1];
		int num2=14;
		int arr2[]=new int[num2];
		for(int i=0;i<num1;i++) {
			arr1[i]=i+1;
		}
		for(int i=0;i<num2;i++) {
			arr2[i]=i+1;
		}
		perfectSquare(arr1,num1);
		perfectSquare(arr2,num2);
	}

}
