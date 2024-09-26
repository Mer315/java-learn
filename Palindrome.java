package sumedha_practice;
import java.util.Scanner;
import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		Scanner p = new Scanner(System.in);
		System.out.println("enter string");
		String input;
		int i;
		char c;
		String palindrome="";
		input = p.nextLine();
		for(i = input.length()-1;i>=0;i--) {
			c = input.charAt(i);
			palindrome = palindrome + c;
		}
		System.out.println(palindrome);
		if(input.equals(palindrome)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}
}
