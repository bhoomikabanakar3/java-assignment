package placementprograms;
import java.util.Scanner;

public class pizza {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		String size=sc.nextLine();
		int price=0;
		switch(size){
		case "smallsize":{
			System.out.println(price=125);
			break;
		}
		case "mediumsize":{
			System.out.println(price=250);
			break;
		}
		case "large":{
			System.out.println(price=300);
			break;
		}
		case "verylargesize":{
			System.out.println(price=350);
			break;
		}
		default:
			System.out.println("you have not entered the correct choice.Please try again");
		}
		}
		

}
