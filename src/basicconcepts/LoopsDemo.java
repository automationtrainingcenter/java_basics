package basicconcepts;

import java.util.Scanner;

public class LoopsDemo {
	// print numbers from 0 to given number
	public static void while_loop(int num) {
		// initialization
		int i = 0;
		// condition
		while (i < num) {
			System.out.print(i + "\t");
			i++; // i = i+1
		}
	}

	// print numbers from given number to 0
	public static void do_while(int num) {
		// initialization
		int i = num;
		do {
			System.out.print(i + "\t");
			// decrement
			i--;
		} while (i >= 0);// condition
	}

	// print even numbers from 0 to given number
	public static void for_loop(int num) {
		for (int i = 0; i < num; i = i + 2) {
			System.out.print(i + "\t");
		}
	}

	// break statement: it will terminate the loop
	public static void break_statement() {
		Scanner s = new Scanner(System.in);
		String value = "";
		int i = 0;
		while (i < 10) {
			System.out.println("enter a string");
			value = s.next();
			i++;
			if (value.equals("exit")) {
				break;
			}
			System.out.println("value  = " + value);
		}
	}

	// continue statement: it will skip current iteration
	public static void continue_statement() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void loops() {
		Scanner s = new Scanner(System.in);
		String value = "";
		for (int i = 0; i < 10; i++) { /* outer */
			System.out.println("enter a string");
			value = s.next();
			boolean r = false;
			for (int j = 0; j < value.length(); j++) {/* inner */
				char ch = value.charAt(j);
				r = isVowel(ch);
				if (r) {
					break;
				}
			}
			if (r) {
				continue;
			}
			System.out.println(value);
		}
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
//		LoopsDemo.while_loop(15);
//		LoopsDemo.do_while(10);
//		LoopsDemo.for_loop(100);
//		LoopsDemo.break_statement();
//		LoopsDemo.continue_statement();
		LoopsDemo.loops();
	}

}
