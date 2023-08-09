package org.system;

public class Desktop extends computer {
    public void keyboard() {
    	System.out.println("it has keyboard");
    }
	public void powerbutton() {
		System.out.println("it has power button");
	}
	public static void main(String[] args) {
	  
		Desktop obj=new Desktop();
		obj.Processor();
		obj.GraphicCard();
		obj.InputPort();
		obj.Display();
		obj.keyboard();
		obj.powerbutton();
		
	}

}
