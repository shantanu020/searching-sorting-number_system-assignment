package Sorting;

public class Bubble {
    public static void main(String [] args){
        int [] arr= {3,5,1,6,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       for(int i=0;i<n;i++) {
    	  System.out.print(arr[i]+" ");
       }
    }
}
