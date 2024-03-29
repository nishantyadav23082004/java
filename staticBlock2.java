import java.util.*;
class ATM{
	static int total;
	static{
		total=100000;
		System.out.println("total: "+total);
	}
}
class Customer extends ATM{
	int accNum,withdrawAmt;
	String name;
	static int balAmt;
	Scanner sc=new Scanner(System.in);
	static{
		balAmt=4000;
	}
	void get(){
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter accNum: ");
		accNum=sc.nextInt();
		System.out.println("Enter withdrawAmt: ");
		withdrawAmt=sc.nextInt();
	}
	void transaction(){
		if(balAmt>withdrawAmt){
			balAmt=total-withdrawAmt;
			total=total-withdrawAmt;
			System.out.println("Balance: "+balAmt);
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
	public static void main(String[] args){
		Customer c1=new Customer();
		c1.get();
		c1.transaction();
		System.out.println("Total cash in the ATM is: "+total);
		Customer c2=new Customer();
		c2.get();
		c2.transaction();
		System.out.println("Total cash in the ATM is: "+total);
	}
}