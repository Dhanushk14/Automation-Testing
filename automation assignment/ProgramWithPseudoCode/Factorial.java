package ProgramWithPseudoCode;

public class Factorial {

	public static void main(String[] args) {
		// Initialize integer variable fact and assign 1 to it
		int fact=1;
		//Iterate for loop from the value i=5 to i=1
		for (int i = 5; i >=1; i--) {
		// apply logic of factorial as fact*i
		fact = fact*i;
		}
		//print the fact value
		System.out.println(fact);
	}

}
