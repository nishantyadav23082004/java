import java.util.*;
class Paytm{
	boolean proceedAndPay(String item,int amount,int balance){
		if(amount<balance){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String arg[]){
		Paytm p1=new Paytm();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		System.out.println("Enter your balance:");
		int bal=s.nextInt();
		System.out.println("Enter your Phone number:");
		long ph=s.nextLong();
		System.out.println("Enter the Amount:");
		int amount=s.nextInt();
		boolean r=p1.proceedAndPay(name,amount,bal);
		System.out.println(name);
		System.out.println(ph);
		System.out.println(amount);
		if(r){
			System.out.println("The item is ordered");
			System.out.println("Balance now: "+(bal-amount));
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
}