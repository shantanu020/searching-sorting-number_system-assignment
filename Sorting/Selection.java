package Sorting;

public class Selection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int [] arr= {3,5,1,6,0};
	        int n=arr.length;
	        int max;
	        for(int i=0;i<n-1;i++){
	        	max=i;
	            for(int j=i;j<n;j++){
	                if(arr[max]<arr[j]) {
	                	max=j;
	                }
	            }
	            int temp=arr[i];
	            arr[i]=arr[max];
	            arr[max]=temp;
	        }
	       for(int i=0;i<n;i++) {
	    	  System.out.print(arr[i]+" ");
	       }
	}
}
