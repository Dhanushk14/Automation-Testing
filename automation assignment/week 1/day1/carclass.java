package Assigment;

class carclass {
    
	public void applyBreak() {
		System.out.println(" Break applied");
	}
	public void applyGear() {
		System.out.println(" Gear apllied");
	}
	public void switchOnAc() {
		System.out.println(" Ac switched On");
	}
	public void applyAccelarate() {
		System.out.println(" Speed Increased");
	}
	public static void main(String[] args) {
      carclass carAction = new carclass();
      carAction.applyBreak();
      carAction.applyGear();
      carAction.switchOnAc();
      carAction.applyAccelarate();

	}

}
