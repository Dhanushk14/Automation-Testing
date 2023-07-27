package Assigment;

import java.util.Scanner;

public class isPrimeOrNot {

	public static void main(String[] args) {
     int count=0;
     int num;
	 Scanner number=new Scanner(System.in);
	 System.out.print("Enter the Number : ");
	 num=number.nextInt();
	 number.close();
	 if(num==0||num==1){
		 System.out.println(" Is not Prime number");
	 }
	 else {
	 for(int i=2;i<num;i++){
		if(num%i==0) {
		 count++;
		 break;
		}
	 }
	 if(count ==0) {
	    System.out.println(num+" Is Prime Number");	 
	 }else {
		 System.out.println(num+" Is not Prime Number");
	 }
	 }
}
}
