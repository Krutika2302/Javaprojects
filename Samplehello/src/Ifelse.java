

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age : ");
		age = sc.nextInt();

		if(age>=18 && age<20) {
			System.out.println("You are elegible to vote.");
		}
		else if(age>=20) {
			System.out.println("You are a Major ");
		}
		else {
			System.out.println("You are not a major ");
		}
	}

}