package Searching;
import java.util.Scanner;
public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int m=sc.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target");
		int target=sc.nextInt();
		int flag=0;
		for(int i=0;i<m;i++) {
			if(arr[i]==target) {
				System.out.println("Element found at index "+i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not found");
		}
		
		sc.close();
	}

}
