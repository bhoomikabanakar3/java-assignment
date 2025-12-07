package placementprograms;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter total bill amount:");
		double amount=sc.nextDouble();
		double discount=0;
		
		if(amount>2000) {
			discount=amount*0.15;
		}else if(amount>1000) {
			discount=amount*0.08;
		}else {
			discount=0;
		}
		double finalAmount=amount-discount;
		System.out.println("Discount Applied: " +discount);
		System.out.println("final Bill Amount:"+finalAmount);
		sc.close();
		

	}

}
