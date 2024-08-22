package programs;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String s = input.nextLine();
		System.out.println("enter age:");
		int age = input.nextInt();
		System.out.println("enter roll number");
		String r = input.nextLine();
		System.out.println("my name is:"+ s);
		System.out.println("age:"+ age);
		System.out.println("my rollnumber is:"+ r);
		
	}
}
