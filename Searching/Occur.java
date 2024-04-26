package Searching;

public class Occur {
	public static void targetOccur(int [] arr,int target) {
		int m=arr.length;
		int count=0;
		for(int i=0;i<m;i++) {
			if(target==arr[i]) {
				count++;
			}
		}
		if(count>0) System.out.println("no of occurence "+count);
		else System.out.println(-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int nums1[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		targetOccur(nums1,5);
		int nums2[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		targetOccur(nums2,6);
	}

}
