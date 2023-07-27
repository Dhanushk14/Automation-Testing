package Assigment;

public class fibbinocciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int lastnumber =56;
		System.out.println(a);
		if(a<=lastnumber) {
		for(int i=1;i<=11;i++){
			
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			}
		}
	}

}
