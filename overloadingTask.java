import java.util.*;
class ShoppingCart{
	public void addToCart(String item_Name){
		System.out.println("Name "+item_Name);
	}
	public void addToCart(String item_Name,int quantity){
		System.out.println("Name "+item_Name+" Quantity "+quantity);
	}
	public void addToCart(String item_Name,int quantity,double bill){
		System.out.println("Name "+item_Name+" Quantity "+quantity+" Bill "+bill);
	}
}
class Overloading{
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int num1=sc.nextInt();
		double d1=sc.nextDouble();
		ShoppingCart obj1=new ShoppingCart();
		obj1.addToCart(s1);
		obj1.addToCart(s1,num1);
		obj1.addToCart(s1,num1,d1);
	}
}