package basicconcepts;

import java.awt.print.Printable;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {
	public static void main(String[] args) {
		// declaring a 1-D array
		char[] values = new char[5];
		// storing
		values[0] = 'v';
		values[1] = 'i';
		values[2] = 'd';
		values[3] = 'y';
		values[4] = 'a';

		// retrieve
//		System.out.println(values[0]);
//		System.out.println(values[1]);
//		System.out.println(values[2]);
//		System.out.println(values[3]);
//		System.out.println(values[4]);
//		System.out.println(values[5]); //ArryaIndexOutOfBound exception

		// retrieving data of an array using normal for loop
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		// initialize
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
//		System.out.println(vowels[0]);
//		System.out.println(vowels[1]);
//		System.out.println(vowels[2]);
//		System.out.println(vowels[3]);
//		System.out.println(vowels[4]);

		// retrieving data of an array using for each loop
		// for(array_data_type var_name : array_var_name){ ....... }
		for (char vowel : vowels) {
			System.out.println(vowel);
		}

		// find the length of an array
		// var_naem.length
		System.out.println("length of vowels array is: " + vowels.length);

		// 2-D arrays
		// declaration : data_type[][] var_name = new
		// data_type[row_length][column_length];
		int[][] data = new int[2][2];

		// storing data
		data[0][0] = 1; // 1st row 1st column
		data[0][1] = 0; // 1st row 2nd column
		data[1][0] = 0; // 2nd row 1st column
		data[1][1] = 1; // 2nd row 2nd column

		// retrieve
//		System.out.print(data[0][0] + "\t");
//		System.out.println(data[0][1]);
//		System.out.print(data[1][0] + "\t");
//		System.out.println(data[1][1]);

//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(data[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		for(int[] row : data) {
			for(int cell : row) {
				System.out.print(cell+"\t");
			}
			System.out.println();
		}
	}

}
