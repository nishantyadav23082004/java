import java.util.*;
class Person{
	private int age=40;
	static int regno=12345;
	class AadharCard{
		void generate_id(){
			System.out.println(age);
			System.out.println(new Person());
		}
		static void call(){
			
		}
	}
	public static void main(String[] st){
		Person.AadharCard a=new Person.AadharCard();
		a.generate_id();
		Person.AadharCard.call();
	}
}