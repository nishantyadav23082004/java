import java.util.*;
interface Booking{
	int bookRoom();
}
class Student{
	public static void main(String arg[]){
		int r=90;
		Booking c=new Booking(){
			int amt1=1000;
			int amt2=2000;
			int amt3=3000;
			int amt4=4000;
			int choice;
			public int bookRoom(){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the choice of seater(1/2/3/4):");
				choice=sc.nextInt();
				switch(choice){
					case 1:
						System.out.println(amt4);
						break;

					case 2:
						System.out.println(amt3);
						break;

					case 3:
						System.out.println(amt2);
						break;

					case 4:
						System.out.println(amt1);
						break;

					default:
						System.out.println("Please select a valid choice of seater");
						break;
				}
				return choice;
			}
		};
		c.bookRoom();
	}
}