package Assigment;

public class Mobile {
    public void makeCall() {
    	System.out.println(" call generated");
    }
    public void shareDocument() {
    	System.out.println(" Document shared");
    }
    public void sendMessage() {
    	System.out.println(" Message sent");
    }
	public static void main(String[] args) {
		Mobile mobileAction = new Mobile();
		mobileAction.makeCall();
		mobileAction.shareDocument();
		mobileAction.sendMessage();
	}
}
