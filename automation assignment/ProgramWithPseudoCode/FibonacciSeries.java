package ProgramWithPseudoCode;

public class FibonacciSeries {

	public static void main(String[] args) {
	// Initialize the variable a,b,c and assign value as 0,1,0
	int a=0,b=1,c=0;
	//Print the value of a
	System.out.println(a);
	//Iterate for loop from the value i=1 to i=11
	for(int i=1;i<=11;i++){
	//add a+b and assign to c	
		c=a+b;
	//assign b value to a
		a=b;
	//assign c value to b
		b=c;
	//print the c value
		System.out.println(c);
		}
	}

}
