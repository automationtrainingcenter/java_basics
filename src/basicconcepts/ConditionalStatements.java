package basicconcepts;

import java.util.Scanner;

public class ConditionalStatements {
	static Scanner s;

	public void ifMethod() {
		// print verify given number is positive
		System.out.println("please enter a number");
		int i = s.nextInt();
		// if
		if (i > 0) {
			System.out.println("given number is positive");
		}
		System.out.println("statement after if{}");
	}

	public void if_else_method() {
		// verify given number is even or odd
		System.out.println("enter a number");
		int num = s.nextInt();
		// if else
		if (num % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}
	}

	public void else_if_ladder_method() {
		System.out.println("enter 1st number");
		int a = s.nextInt();
		System.out.println("enter 2nd number");
		int b = s.nextInt();
		if (a > b) {
			System.out.println("a is bigger");
		} else if (b > a) {
			System.out.println("b is bigger");
		} else {
			System.out.println("a and b are equal");
		}
	}

	public void nested_if_method() {
		System.out.println("enter 1st number");
		int a = s.nextInt();
		System.out.println("enter 2nd number");
		int b = s.nextInt();
		if (a != b) {
			if (a > b) {
				System.out.println("a is bigger");
			} else {
				System.out.println("b is bigger");
			}
		} else {
			System.out.println("a is equal to b");
		}
	}

	public void switch_method() {
		System.out.println("enter a character");
		char ch = s.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("not a vowel");
		}
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		ConditionalStatements obj = new ConditionalStatements();
//		obj.ifMethod();
//		obj.if_else_method();
//		obj.else_if_ladder_method();
//		obj.nested_if_method();
		obj.switch_method();
	}
}
