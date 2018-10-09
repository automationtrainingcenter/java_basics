package basicconcepts;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		String s3 = "Selenium";
		String s4 = "welcome to selenium webdriver with Java programming laungauge";
		String s5 = "                         actual text                    ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println("length of selenium is : " + s1.length());
		System.out.println("length of s2 string is : " + s2.length());

		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println(s1.isEmpty()); // false
		System.out.println(s2.isEmpty()); // true

		/* concat(): combines two given strings */
		s1 = s1.concat(" webdriver");
		System.out.println(s1);

		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals(s3)); // false
		System.out.println(s3.equals("Selenium")); // true

		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s3.equalsIgnoreCase("SELENIUM")); // true
		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s4.contains(s1)); //true
		System.out.println(s4.contains("java")); //false
		System.out.println(s4.toLowerCase().contains("java")); //true
		
		
		/* toLowerCase(): converts given string to lower case */
		s3 = s3.toUpperCase();
		System.out.println(s3);
		
		/* toUpperCase(): converts given string to upper case */
		s3 = s3.toLowerCase();
		System.out.println(s3);
		
		/* charAt(): returns a character at a given index number */
		char ch = s3.charAt(3);//e
		System.out.println(ch);
		
		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s3.indexOf('e')); //1
		System.out.println(s3.indexOf('x')); //-1
		
		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s4.startsWith("welcome")); //true
		System.out.println(s3.startsWith("Sel"));//
		
		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s3.endsWith("ium")); //true
		System.out.println(s4.endsWith("selenum")); //false
		
		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s3.replace('e', 'E'));
//		System.out.println(s3);
		System.out.println(s4.replace("Java", "Python"));

		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values Note: substring() will include the beginning
		 * index character and excludes ending index character
		 */
		System.out.println(s1.substring(9));
		System.out.println(s4.substring(15));
		System.out.println(s1.substring(9, 12));
		System.out.println(s4.substring(15, 20));
		
		/* toCharArray() return an array of characters inside the given string */
		char[] chars = s3.toCharArray();
		System.out.println(chars.length);
		
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s4.split(" ");
		System.out.println(words.length);
		
		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println("before trim: \n"+s5);
		s5 = s5.trim();
		System.out.println("after trim: \n"+s5);
		
		//reverse given string
	}
}
