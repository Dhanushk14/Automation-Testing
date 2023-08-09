package Assignment3.Bank;

public class AxisBank extends BankInfo{
    
	@Override
	public void deposit() {
		System.out.println("MethodOverriding deposit");
	}
	public static void main(String[] args) {
		AxisBank info=new AxisBank();
		info.saving();
		info.deposit();
	}
}
