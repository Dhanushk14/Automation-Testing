package ProgramWithPseudoCode;

import java.util.Arrays;

public class SortingNumbers {

	public static void main(String[] args) {
		//Assign an Integer Array {45,23,76,12,1,99,56}
		int[] number= {45,23,76,12,1,99,56};
       //sorting the array
		Arrays.sort(number);
	
		System.out.println("Ascending Order");
	   //Iterate FOR loop for ascending order the value of i from o to length of array
		for (int i = 0; i <=number.length-1; i++) {
		//print the value
	    System.out.println(number[i]);
		}
		
		System.out.println("Descending Order");
		//Iterate FOR loop for descending order the value of j from array.length-1 to 0
		for (int j = number.length-1;j>=0; j--) {
		//print the value
		System.out.println(number[j]);
		}
	}

}
