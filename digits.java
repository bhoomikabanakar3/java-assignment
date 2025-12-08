package placementprograms;

public class digits {

	public static void main(String[] args) {
		int num=6784;
		int sum=0;
		while(num >0) {
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
		System.out.println("sum of the digits="+sum);
		}
			

		
	}


