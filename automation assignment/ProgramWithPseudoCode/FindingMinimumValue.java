package ProgramWithPseudoCode;

public class FindingMinimumValue {

	public static void main(String[] args) {
		//Intialize an Integer Array {10,30,20,54,97}
          int[] number= {10,30,20,54,97};
		//Use Max_value Logic and assign to int variable
		int maxvalue=Integer.MAX_VALUE;
		//print the maxvalue
		System.out.println(maxvalue);	
		//Iterate for loop from the value i=0 to array length
		for(int i=0; i<number.length;i++) {
		//Initialize integer variable minvalue
		int minvalue = 0;
		// compare the maxvalue to array value by using index i	
				if(number[i] < maxvalue) {
		//Declare the minvalue and assign the minimum array value 
			 minvalue=number[i];
				}
		//print the minvalue
		System.out.println(minvalue);
		//Declare Break
		break;
		 }
	}

}
