package Abstraction;

public class ExceutionClass extends MultipleLanguage {

	public void java() {
		System.out.println("Java language called from Language interface ");
		
	}

	public void selenium() {
		System.out.println("Selenium called from Testtool Interface");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby called from Multiplelanguage Abstract class");
		
	}
    public void html() {
    	System.out.println("html called from execution class");
    }
	public static void main(String[] args) {
		ExceutionClass obj=new ExceutionClass();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
		obj.html();

	}

}
