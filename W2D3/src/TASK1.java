import java.util.*;
public class TASK1 {
	public static void main(String args[]) {
		int n,se=0,so=0,i,max=0;
		System.out.println("Enter number of elements in the Array");
		
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		int[] arr = new int[n];
		
		if(n<0) {
			System.out.println("Invaild Array Size");
		}
		for(i=0;i<n;i++) {
			System.out.println("Enter Elements in the array");
			arr[i]=a.nextInt();
		}
		for(i=0;i<n;i++) {
			if(arr[i]<0) {
				System.out.println("Invaild Input");
			}
		}
		for(i=0;i<n;i++) {
			if(arr[i]%2==0) {
				se=se+arr[i];
			}
			else {
				so=so+arr[i];
			}
				
		}
		if(so>se) {
			System.out.println("total is: " +so);
		}
		else {
			System.out.println("total is: " +se);
		}
	
		
	}

}
