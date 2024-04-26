package Sorting;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr= {3,5,1,6,0};
		  int pass=0;
	        int n=arr.length;
	        for(int i=0;i<n;i++){
	        	int c=0;
	            for(int j=0;j<n-1;j++){
	                if(arr[i]>arr[j]){
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                    c=1;
	                }
	            
	            }
	            if(c==0) {
	            	break;
	            }
                pass++;
	        }
	     
	    	  System.out.print("no of pass "+pass);
	       
	}

}
