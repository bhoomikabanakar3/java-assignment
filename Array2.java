package placementprograms;
import java.util.*;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {34,65,21,7,58,95,43,61,98,46};
		System.out.println("enter the starting index");
		int sindex=sc.nextInt();
		System.out.println("enter the ending index");
		int eindex=sc.nextInt();
		Array2.subArray(arr,sindex,eindex);
	}
	public static void subArray(int arr[],int sindex,int eindex) {
		for(int i=sindex;i<=eindex;i++) {
			
			System.out.println(arr[i]);
		
		}

	}

}
