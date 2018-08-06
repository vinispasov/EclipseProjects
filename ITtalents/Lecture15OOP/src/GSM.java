import java.util.Scanner;
public class GSM {
	Scanner sc=new Scanner(System.in);
	//state
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	double lastIncomingCall;
	double lastOutgoingCall;
	
	//behavior
	
	void insertSimCard() {
		System.out.println("Enter mobile number: ");
		simMobileNumber=sc.nextLine();
		
		int counter=0;
		for (int i = 0; i < simMobileNumber.length(); i++) {
			counter++;
		}
		char firstSymbol=simMobileNumber.charAt(0);
		char secondSymbol=simMobileNumber.charAt(1);
		if (counter==10&&firstSymbol==0&&secondSymbol==8) {
			hasSimCard=true;
			System.out.println("Your sim card is activated.");
		}
		else {
			System.out.println("Sim card not found!");
		}
	}
	
	void removeSimCard() {
		hasSimCard=false;
		System.out.println("You have removed your sim card.");
	}
	
	void call(Call newCall) {
	
		while (newCall.duration>180) {
			System.out.println("Too much time.Enter duration of call again:");
			newCall.duration=sc.nextInt();
		}
		
		if (newCall.caller.equals(newCall.receiver)) {
			System.out.println("You tried to call to the same number!");
		}
		if (hasSimCard) {
			
		}
		
	}

}
