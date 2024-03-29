import java.util.*;
interface BookOrder{
	double order(String name,int num_item);
}
class Customer{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		String name1=sc.nextLine();
		int num1=sc.nextInt();
		if(num1<=5){
			BookOrder ob=(x,y)->(y*5);
			System.out.println(ob.order(name1,num1));
		}
		else if(num1<=10){
			BookOrder ob=(x,y)->(y*10);
			System.out.println(ob.order(name1,num1));
		}
		else{
			System.out.println("INVALID INPUT");
		}
	}
}