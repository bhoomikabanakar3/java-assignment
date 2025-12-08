package placementprograms;
import java.util.Scanner;

public class searchNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter number to search");
		int num=sc.nextInt();
		boolean found=false;
		for(int i=0;i<size;i++) {
			if(arr[i]==num) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(num+"is present in the array");
		}else {
			System.out.println(num+"is not present int the array");
		}
		sc.close();
	}

		}
		
       
}


