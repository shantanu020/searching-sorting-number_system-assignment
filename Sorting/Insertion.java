package Sorting;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,5,1,6,0};
        int n=arr.length;
        for(int i=1;i<n;i++){
        	int key=arr[i];
        	int j=i-1;
        	while(j>=0&&arr[j]<key) {
        		arr[j+1]=arr[j];
        		j--;
        	}
        	arr[j+1]=key;
        }
       for(int i=0;i<n;i++) {
    	  System.out.print(arr[i]+" ");
       }
	}

}
